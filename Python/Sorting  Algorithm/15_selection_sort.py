def selection_sort(arr):
    for i in range(0 , len(arr) - 1):
        min_idx = i
        for j in range(i+1 , len(arr)):
            if arr[j] < arr[min_idx]:
                min_idx = j
        
        temp = arr[i]
        arr[i] = arr[min_idx]
        arr[min_idx] = temp

    return arr

def selection_sort_recursive(arr , start):
    n = len(arr)

    if start >= n - 1:
        return arr
    
    min_idx = start
    for j in range(start+1   , n):
        if arr[j] < arr[min_idx]:
            min_idx = j

    arr[start] , arr[min_idx] = arr[min_idx] , arr[start]

    return selection_sort_recursive(arr , start+1)

def main():
    arr = [5,7,8,4,1,6,9,2]

    sorted_array = selection_sort(arr)
    recursively_sorted = selection_sort_recursive(arr , 0)

    print("Sorted array :  ",sorted_array)
    print(f"Selection sort using recursion : {recursively_sorted}")
if __name__ == "__main__":
    main()