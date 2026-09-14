def solution(nums , target):
    sort_nums = sorted(nums)
    left = 0 
    right = len(sort_nums)-1

    while(left < right):
        if sort_nums[left] + sort_nums[right] == target:
            return (nums.index(sort_nums[left]) , nums.index(sort_nums[right]))

        if sort_nums[left] + sort_nums[right] > target:
            right-=1

        if sort_nums[left]+sort_nums[right] < target:
            left+=1

    return -1

def solution2(nums , target):
    seen = {}
    for i , num in enumerate(nums):
        complete = target - num
        if complete in seen:
            return [seen[complete] , i]

        seen[num] = i

    return -1
def main():
    nums = [5,1,9,7,4,3]  
    ans = solution2(nums , 13)
    print(ans)

main()