class Solution:
    def findMaxConsecutiveOnes(self, nums) -> int:
        maximum , count = 0 ,0
        for num in nums:
            if num==1:
                count+=1
            else:
                count = 0

            if(count > maximum):
                maximum = count
        return maximum

lst = [1,0,1,1,0]
obj = Solution()
print(obj.findMaxConsecutiveOnes(lst))