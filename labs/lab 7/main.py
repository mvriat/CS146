import sys


def find_the_city(n, edges, distance_threshold):
    graph = [[float('inf')] * n for _ in range(n)]
    for i in range(n):
        graph[i][i] = 0
    for u, v, weight in edges:
        graph[u][v] = weight
        graph[v][u] = weight

    for k in range(n):
        for i in range(n):
            for j in range(n):
                if graph[i][k] != float('inf') and graph[k][j] != float('inf'):
                    graph[i][j] = min(graph[i][j], graph[i][k] + graph[k][j])

    minimum_count = sys.maxsize
    result = -1
    for i in range(n):
        count = 0
        for j in range(n):
            if i != j and graph[i][j] <= distance_threshold:
                count += 1
        if count <= minimum_count:
            minimum_count = count
            result = i

    return result


if __name__ == "__main__":
    test1 = [[0, 1, 3], [1, 2, 1], [1, 3, 4], [2, 3, 1]]
    print(find_the_city(4, test1, 4))

