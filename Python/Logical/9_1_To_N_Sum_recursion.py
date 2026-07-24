#Sum of 1 to N using parametrize recursion
# def total_Sum(sum , i , n):
#     if i > n:
#         return sum
    
#     return total_Sum(sum+i, i+1 , n)

def total_Sum(n):
    if n==1:
        return 1
    
    return n + total_Sum(n-1)

def main():
    sum = 0 
    n = 10
    i = 1
    ans = 0
    ans = total_Sum(n)
    print("Total Sum  : " , ans)
if __name__ == "__main__":
    main()