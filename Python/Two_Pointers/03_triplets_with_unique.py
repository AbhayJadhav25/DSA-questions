'''
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
'''

def solution(nums):
    nums.sort()
    ans = []
    for i in range(len(nums)-2):
        if(i>0 and nums[i]==nums[i-1]):
            continue

        s = -1 * nums[i]
        left = i + 1
        right = len(nums)-1

        while(left < right):
            s2 = nums[left]+nums[right]
            if(s2 == s):
                ans.append([nums[i] , nums[left] , nums[right]])
                left+=1
                right-=1

                while(left < len(nums) and nums[left] == nums[left - 1]):
                    left+=1

                while(right>=0 and nums[right] == nums[right+1]):
                    right-=1

            elif s > s2:
                left+=1

            else:
                right -=1

    return ans
def main():
    nums = [-1,0,1,2,-1,-4]
    ans = solution(nums)
    print(ans)
if __name__ == "__main__":
    main()
