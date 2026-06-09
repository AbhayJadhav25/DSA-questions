def insertion_sort(arr):
   n = len(arr)
   for i in range(1 , n):
       key = arr[i]

       j = i - 1
       while(j>=0 and arr[j]>key):
           arr[j+1] = arr[j]
           j = j - 1

       arr[j+1] = key

   return arr
    
def main():
    arr = [5,7,8,4,1,6,9,2]

    sorted_array = insertion_sort(arr)

    print("Sorted array :  ",sorted_array)

if __name__ == "__main__":
    main()