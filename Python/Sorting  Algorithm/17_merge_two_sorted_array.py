
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
def main():
    left = [1,2,3,4]
    right = [1,1,3,4,5,6,7]

    result = merge_array(left , right)
    print("In main")
    print(result)

if __name__ == "__main__":
    print(" Calling In main")
    main()
