def solution(arr):
    if len(arr)<2:
        return -1
    
    largest = -1
    second = -1

    for nums in arr:
        if nums > largest:
            second = largest
            largest = nums
        elif nums>second and nums!=largest:
            second = nums

    return second
arr= [10,10,10]
ans = solution(arr)
print(ans)