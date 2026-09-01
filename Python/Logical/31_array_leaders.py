def array_leaders(arr):
    n = len(arr)-1
    lst = []
    lst.append(arr[n])
    maximum = arr[n]
    for i in range(n-1 , -1 , -1):
        if arr[i]>=maximum:
            lst.append(arr[i])
            maximum = arr[i]
    return list(reversed(lst))

def main():
    arr = [7, 10, 4, 10, 6, 5, 2]
    ans = array_leaders(arr)
    print(ans)

if __name__ == "__main__":
    main()