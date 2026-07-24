def array_reverse(arr , left , right):
    if left > right :
        return arr
    
    temp = arr[left]
    arr[left] = arr[right]
    arr[right] = temp

    return array_reverse(arr , left + 1 , right - 1)
def main():

    arr = [5 ,7 ,1 , 3 ,9 , 8]
    left = 0 
    right = len(arr)
    reverse_array = array_reverse(arr , left , right-1)

    print("Reverse Array : ")
    print(reverse_array)

if __name__ == "__main__":
    main()