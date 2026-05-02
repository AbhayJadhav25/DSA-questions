from math import log10
def countDigit(num):
    if num== 0:
        return 1
    
    return int(log10(num) + 1)

def main():
    number = int(input("Enter Number : "))
    res = countDigit(number)
    print("Total Digits = ",res)

if __name__ == "__main__":
    main()