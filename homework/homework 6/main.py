def three_sum(nums):
    nums.sort()
    answer = []
    if len(nums) < 3:
        return answer
    for i in range(len(nums) - 2):
        if i > 0 and nums[i] == nums[i - 1]:
            continue
        j, k = i + 1, len(nums) - 1
        while j < k:
            sum = nums[i] + nums[j] + nums[k]
            if sum == 0 and i != j and i != k and j != k:
                answer.append([nums[i], nums[j], nums[k]])
                k -= 1
                while j < k and nums[k] == nums[k + 1]:
                    k -= 1
            elif sum > 0:
                k -= 1
            else:
                j += 1
    return answer

if __name__ == "__main__":
    test1 = [0, 1, 1]
    print(three_sum(test1))
    test2 = [-5, 0, 5, 10, -10, 0]
    print(three_sum(test2))
    test3 = [5, 6, 4, 3, 0, 0, 2, 1]
    print(three_sum(test3))

