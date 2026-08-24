def next_palindrome(num):
    number = str(num)
    number_len = len(number)

    if number == "9"*number_len:
        return '1'+'0'*(number_len-1)+'1'
    
    ans = ""
    #step 1 : Extract the mid part of the string
    mid = number_len // 2
    left_half = number[:mid]
    ans += left_half

    #step 2 : Mirror the left_half
    ans += left_half[::-1]

    #step 3 : check ans is greater than original num or not
    if int(ans)>num:
        return ans

    if number_len%2==0:
        ans = ""
        left_half = str(int(left_half)+1)
        ans+=left_half
        ans+=left_half[::-1]
        return ans
    else:
        ans = ""
        mid = number_len//2 + 1
        left_half = number[:mid]
        ans+=left_half
        left_half_cut = left_half[:-1]
        ans+=left_half_cut[::-1]

        if int(ans)>num:
            return ans

        ans = ""
        left_half = str(int(left_half)+1)
        ans+=left_half
        left_half_cut = left_half[:-1]
        ans+=left_half_cut[::-1]

        return ans



def main():
    num = int(input("Enter any number : "))
    ans = next_palindrome(num)
    print(ans)
if __name__ == "__main__":
    main()