from math import log10
def armstrong(num , power):
    temp = num
    sum = 0

    while(num > 0):
        rem = num % 10
        sum = sum + (rem**power)
        num = num//10

    if temp==sum:
        return True
    else:
        return False

def main():
    number = input("Enter Number : ")
    power = len(number)
    res = armstrong(int(number) , power)

    if(res):
        print(f"{number} is Armstrong")
    else:
        print(f"{number} is not Armstrong")

if __name__ == "__main__":
    main()