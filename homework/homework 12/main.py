from typing import List


def find(parent_nodes: List[int], x: int) -> int:
    if parent_nodes[x] != x:
        parent_nodes[x] = find(parent_nodes, parent_nodes[x])
    return parent_nodes[x]


def min_cost_to_supply_water(n: int, wells: List[int], pipes: List[List[int]]) -> int:
    nums = pipes.copy()
    for i in range(n):
        nums.append([0, i + 1, wells[i]])
    nums.sort(key=lambda x: x[2])
    parent_nodes = list(range(n + 1))
    result = 0
    for a, b, c in nums:
        parent_a, parent_b = find(parent_nodes, a), find(parent_nodes, b)
        if parent_a != parent_b:
            parent_nodes[parent_a] = parent_b
            result += c
            n -= 1
            if n == 0:
                return result
    return result


if __name__ == "__main__":
    n = 2
    wells = [1, 1]
    pipes = [[1, 2, 1], [1, 2, 2]]
    print(min_cost_to_supply_water(n, wells, pipes))

