#Reverse part of array 
'''
i/p : 5 ,7 ,3 ,2 , 6 , 1 ,5 , 9   --> we have to reverse from  index 2 to 5 it means 3 to 1
o/p : 5 ,7 , 1 , 6, 2 ,3 , 5 , 9
'''

def array_reverse(arr , left , right):
    if left > right : 
        return arr
    
    temp = arr[right]
    arr[right] = arr[left]
    arr[left] = temp

    return array_reverse(arr , left + 1 , right -1 )

def main():
    arr = [5 ,7 , 3 , 2 , 6 , 1, 5 , 9]
    left = 2 
    right = 5

    reverse_array = array_reverse(arr , left , right)
    print(reverse_array)

    #Reverse using python function
    arr.reverse()   #.reverse() modify the original array
    print(f"Using .reverse() = {arr}")

    #keep original 
    arr.reverse()
    reverse2 = arr[::-1]  #it creates a new reverse copy.
    print(f"using [::-1] = {reverse2}")

if __name__ == "__main__":
    main()