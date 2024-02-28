class Solution:
    def longestPalindrome(self, s):
        if len(s) == 0:
            return 0
        count = set()
        dupliCount = 0
        for i in range(len(s)):
            if s[i] in count:
                count.remove(s[i])
                dupliCount += 1
            else:
                count.add(s[i])
        if not count:
            return 2 * dupliCount
        else:
            return 2 * dupliCount + 1

s = "speediskey"
sol = Solution()
print(sol.longestPalindrome(s))
