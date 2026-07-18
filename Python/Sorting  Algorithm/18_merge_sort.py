
def merge_array(left , right):
    i , j = 0,0
    n , m = len(left) , len(right)

    result = []

    while(i<n and j<m):
        if(left[i]<=right[j]):
            result.append(left[i])
            i+=1

        else:
            result.append(right[j])
            j+=1

    if i < n :
        while(i<n):
            result.append(left[i])
            i+=1
    if j < m:
        while(j<m):
            result.append(right[j])
            j+=1
            
    return result

def merge_sort(arr):
    if len(arr)<=1:
        return arr
    
    mid = len(arr)//2
    left_arr = arr[:mid]
    right_arr = arr[mid:]

    left = merge_sort(left_arr)
    right = merge_sort(right_arr)

    return merge_array(left , right)
def main():
    arr = [5,4,7,1,9,8,10]
    
    result = merge_sort(arr)
    print(result)

if __name__ == "__main__":
    print(" Calling In main")
    main()
