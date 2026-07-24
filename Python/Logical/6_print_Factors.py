#another solution --> iterate loop from 1 to num//2. but below is the best optimal solution
import math
def printFactors(num):
   result = []
   for i in range(1 , int(math.sqrt(num)) + 1):
       if num % i == 0:
           result.append(i)
           if num//i != i:
                result.append(num//i)
   return sorted(result)

def main():
    ans = []
    number = int(input("Enter Number : "))
    ans = printFactors(number)
    print(ans)
    
if __name__ == "__main__":
    main()