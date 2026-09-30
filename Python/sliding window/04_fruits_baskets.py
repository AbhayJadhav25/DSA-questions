def solution(nums):
    n = len(nums)
    low , high = 0 , 0
    basket = {}
    result = 0
    for high in range(n):
        basket[nums[high]] = basket.get(nums[high] , 0)+1

        while(len(basket)>2):
            basket[nums[low]]-=1

            if basket[nums[low]] == 0:
                del basket[nums[low]]

            low+=1

        window_len = high - low +1
        result = max(result , window_len)

    return result

def main():
    nums = [0,1,2,2]
    ans = solution(nums)
    print(ans)
if __name__ == "__main__":
    main()