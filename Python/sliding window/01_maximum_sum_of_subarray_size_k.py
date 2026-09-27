def solution(nums , k):
    window_sum = sum(nums[:k])
    low = 0
    high = k - 1
    res = window_sum
    n = len(nums)

    while(high < n):
        low+=1
        high+=1

        if high == n:
            break

        window_sum = window_sum - nums[low-1] + nums[high]
        res = max(window_sum , res)

    print(res)
def main():
    nums = [1,4,2,10,23,3,1,0,20]
    k = 4
    solution(nums , k)
if __name__ == "__main__":
    main()
        