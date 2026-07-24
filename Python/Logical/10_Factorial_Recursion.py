#Factorial of number using recursion
def factorial(num):
    if num==1:
        return 1
    return num * factorial(num - 1)

def main():
    num = 5
    fact = factorial(num)
    print(f"Factorial of {num} = {fact}")
if __name__ == "__main__":
    main()