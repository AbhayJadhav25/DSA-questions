'''
I/p : [0,1,0,1,1,0]
o/p : [0,0,0,1,1,1]
'''
def solution(nums):
    i=0
    for j in range(len(nums)):
        if nums[i]==1 and nums[j]==0:
            nums[i],nums[j] = nums[j],nums[i]
            i+=1
        elif nums[i]==0:
            i+=1
    return nums

def solution2(nums):
    left , right = 0 , len(nums)-1
    while(left < right):
        if nums[left]==1 and nums[right]==0:
            nums[left] , nums[right] = nums[right] , nums[left]
        if nums[left]==0:
            left+=1
        if nums[right]==1:
            right-=1

    return nums
def main():
    nums = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
    print(solution(nums))
    nums1 = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
    print(solution2(nums1))
if __name__ == "__main__":
    main()