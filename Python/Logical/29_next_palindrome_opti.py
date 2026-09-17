def next_palindrome(num):
    number = str(num)
    if number == '9'*len(str(num)):
        return '1'+'0'*(len(number)-1)+'1'

    def make_palindrome(left_half , odd):
        if odd:
            return left_half + left_half[:-1][::-1]
        else:
            return left_half + left_half[::-1]

    odd = len(number) % 2 == 1
    mid = len(number)//2 + (1 if odd else 0)

    left_half = number[:mid]

    ans = make_palindrome(left_half , odd)
    if int(ans) > num:
        return ans

    left_half = str(int(left_half)+1)
    ans = make_palindrome(left_half , odd)
    return ans

def main():
    num = int(input("Enter any number : "))
    ans = next_palindrome(num)
    print(ans)
if __name__ == "__main__":
    main()


'''  
register/Authentication

Applicant - user information

Application - Automation , API gateway

The Perfect BA
Business Analyst A to Z master class
Chandoo for Excel
LearnWidGiggs for powerBI

'''