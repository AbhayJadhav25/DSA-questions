def merge_sort(arr1 , arr2):
    sort_arr = []
    i , j = 0 , 0
    m , n = len(arr1) , len(arr2)
    while(i < m and j<n):
        if arr1[i] <= arr2[j]:
            sort_arr.append(arr1[i])
            i+=1
        else:
            sort_arr.append(arr2[j])
            j+=1

    while(i < m):
        sort_arr.append(arr1[i])
        i+=1

    while(j < n):
        sort_arr.append(arr2[j])
        j+=1

    return sort_arr
        
def square_sort(nums):
    pos = []
    neg = []

    for num in nums:
        if num >= 0 :
            pos.append(num*num)
        else:
            neg.append(num*num)

    if len(neg) == 0:
        return pos

    if len(pos) == 0 :
        return list(reversed(neg))

    neg = list(reversed(neg))

    return merge_sort(pos , neg)

def solution2(nums):
    n = len(nums)
    new_arr = [0]*n
    left , right = 0 , n - 1
    pos = n - 1

    while left <= right : 
        if abs(nums[left]) > abs(nums[right]):
            new_arr[pos] = nums[left]*nums[left]
            left+=1
        else:
            new_arr[pos] = nums[right]*nums[right]
            right-=1

        pos-=1
    return new_arr

def main():
    nums = [-4,-2,0,1,3,10]
    # ans = square_sort(nums)
    ans = solution2(nums)
    print(ans)

main()