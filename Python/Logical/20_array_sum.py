class solution:
    def arraySum(self,arr):
        if len(arr)==0:
            return 0
        
        total = arr[0]
        for i in range(1,len(arr)):
            total+=arr[i]

        return total
	 
   	
class Solution:
    def arraySum(self, arr):
        if len(arr) == 0:
            return 0
        
        total = arr[0]
        for i in range(1, len(arr)):
            total += arr[i]
        
        return total
