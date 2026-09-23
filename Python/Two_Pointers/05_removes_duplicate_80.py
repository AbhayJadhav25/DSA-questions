def solution(nums):
    nums.sort()
    i = 0 
    for num in nums:
        if(i<2 or num!=nums[i-2]):
            nums[i] = num
            i+=1

    return i

lst = [1,1,1,1,2,2,2,3,3,4,5,5]
print(solution(lst))