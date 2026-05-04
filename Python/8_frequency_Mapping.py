def frequency(nums):
    frequency_map = {}

    for i in range(0 , len(nums)):
       frequency_map[nums[i]] = frequency_map.get(nums[i] , 0) + 1
    return dict(sorted(frequency_map.items()))
def main():
    nums = [5,6,7,7,1,9,111,1,1,5,1,1]
    dict = frequency(nums)
    print(dict)
if __name__ == "__main__":
    main()