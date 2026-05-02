
def extractNumber(num):
    while(num > 0):
        print(f"{num%10}",end=" ")
        num = num // 10

def main():
    print("in mian")
    number = int(input("Enter Number : "))
    extractNumber(number)
if __name__ == "__main__":
    main()