# def solution(nums , k):
#     if k == 1:
#         return max(nums)
    
#     window_sum = sum(nums[:k])
#     n = len(nums)
#     low = 0
#     high = k-1
#     res = window_sum
#     while(high < n - 1):
#         low+=1
#         high+=1
#         window_sum = window_sum - nums[low-1]+nums[high]
#         res = max(res , window_sum)
#     print(res)
# def main():
#     nums =[100, 200, 300, 400]
#     k = 1
#     solution(nums , k)
# if __name__ == "__main__":
#     main()

class Solution:
    def maxSubarraySum(self, arr, k):
       window_sum = sum(arr[:k])
       low = 0 
       high = k-1
       res = window_sum
       n = len(n)
       while(high < n):
           low+=1
           high+=1
           
           if high == n:
               break
           
           window_sum = window_sum - arr[low-1] + arr[high]
           res = max(winodw_sum , res)
           
       return res
        