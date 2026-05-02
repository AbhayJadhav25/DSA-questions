
def countDigit(num):
    if num== 0:
        return 1
    count = 0
    while(num > 0):
        count = count + 1
        num = num // 10
    return count

def main():
    number = int(input("Enter Number : "))
    res = countDigit(number)
    print("Total Digits = ",res)

if __name__ == "__main__":
    main()