from typing import List
class treesum: 
    def threeSum(self, nums: List[int]) -> List[List[int]]:
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
                if sum == 0:
                    answer.append([nums[i], nums[j], nums[k]])
                    j -= 1
                    k -= 1
                    while j < k and nums[j] == nums[j - 1]:
                        j += 1
                    while j < k and nums[k] == nums[k + 1]:
                        k -= 1
                elif sum < 0:
                    j += 1
                else:
                    k -= 1
        return answer
    
if __name__ == "__main__":
    test1 = [0, 1, 1]
    print(treesum().threeSum(test1))
    test2 = [-5, 0, 5, 10, -10, 0]
    print(treesum().threeSum(test2))
    test3 = [5, 6, 4, 3, 0, 0, 2, 1]
    print(treesum().threeSum(test3))
