def solution(nums , target):
        nums.sort()
        n = len(nums)
        res = []
        for i in range(n-3):
            if(i>0 and nums[i]==nums[i-1]):
                continue
            for j in range(i+1 , n-2):
                if(j>i+1 and nums[j]==nums[j-1]):
                    continue
                l , r = j+1 , n-1
                while(l<r):
                    sum = nums[i]+nums[j]+nums[l]+nums[r]
                    if sum == target:
                        res.append([nums[i],nums[j] , nums[l] , nums[r]])
                        l+=1
                        r-=1

                        while(l < n and nums[l] == nums[l-1]):
                            l+=1

                        while(r >=0 and nums[r]==nums[r+1]):
                            r-=1
                    elif sum < target:
                        l+=1
                    else:
                        r-=1

        return res
def main():
    nums = [1,0,-1,0,-2,2]
    target = 0
    ans = solution(nums , target)
    print(ans)

main()