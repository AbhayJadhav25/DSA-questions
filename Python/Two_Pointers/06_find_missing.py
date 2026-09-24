def solution1(nums):
    missing = []
    seen = set(nums)
    min_ = min(nums)
    max_ = max(nums)

    for i in range(min_ , max_+1):
        if i in seen:
            continue
        else:
            missing.append(i)

    print(missing)

def solution2(nums):
    min_ = min(nums)
    max_ = max(nums)

    missing = list(set(range(min_ , max_ + 1)) - set(nums))
    print(missing)

def main():
    nums = [15,17,18,22]
    solution1(nums)
    solution2(nums)

main()