
def solution1(nums):
    n = len(nums)
    total = (n*(n+1))//2
    array_total = 0
    for num in nums:
        array_total+=num

    return total - array_total

def solution2(nums):
    n = len(nums)
    missing = n

    for i in range(len(nums)):
        missing = missing ^ i ^ nums[i]

    return missing
def main():
    nums = [1,0,3,4]
    ans = solution1(nums)
    print("Missing Number = ",ans)
    ans = solution2(nums)
    print("Missing Number = ",ans)

if __name__ == "__main__":
    main()