def solution(nums , sum):
    nums.sort()
    n = len(nums)
    count = 0
    for i in range(n - 2):
        l , r = i+1 , n-1
        while(l < r):
            s = nums[i]+nums[l]+nums[r]

            if s == sum :
                r-=1
            elif s < sum:
                count += (r - l)
                l+=1
            else:
                r-=1
    print(count)
            
def main():
    nums = [-2,0,1,3]
    sum = 2
    solution(nums , sum)

main()