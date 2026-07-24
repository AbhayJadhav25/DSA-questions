from math import log10
def countDigit(num):
    temp = num
    rev = 0

    while(num > 0):
        rev = (rev * 10 ) + num%10
        num = num//10

    if temp==rev:
        return True
    else:
        return False

def main():
    number = int(input("Enter Number : "))
    res = countDigit(number)
    
    if(res):
        print(f"{number} is palindrome")
    else:
        print(f"{number} is not palindrome")

if __name__ == "__main__":
    main()