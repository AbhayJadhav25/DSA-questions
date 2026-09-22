def solution(nums , target):
    nums.sort()
    n = len(nums)
    min_diff = float('inf')
    result = 0
    for i in range(n-2):
        left = i+1
        right = n-1
        while(left < right):
            current_sum = nums[i]+nums[left]+nums[right]

            if current_sum == target:
                return current_sum
            elif current_sum > target:
                right-=1
            else:
                left+=1

            diff = abs(target - current_sum)

            if diff < min_diff:
                min_diff = diff
                result = current_sum

    return result

def main():
    nums =   [-1, 0, 1, 1, 1]
    target = 2
    ans = solution(nums , target)
    print(ans)
if __name__ == "__main__":
    main()