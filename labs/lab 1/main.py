def index_finder(nums, target):
    for i in range(len(nums) - 1):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]
    return []


if __name__ == "__main__":
    nums1 = [3, 6, 4, 2]
    target1 = 7
    result1 = index_finder(nums1, target1)
    print(result1)

    nums2 = [1, 1, 1, 1, 1, 1]
    target2 = 4
    result2 = index_finder(nums2, target2)
    print(result2)
