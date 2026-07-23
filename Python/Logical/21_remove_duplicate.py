class Solution:
    def removeDuplicates(self, nums):
        i = 0
        for j in range(1,len(nums)):
            if nums[i]!=nums[j]:
                i+=1
                nums[i] = nums[j]
        return i+1
    
lst = [1,1,2]
obj = Solution()
count  = obj.removeDuplicates(lst)
print(count , lst[:count])