def check_palindrome(str , left , right):
    if left > right : 
        return True
    
    if str[left]!=str[right]:
        return False
    
    return check_palindrome(str , left + 1 , right-1)
def main():
    str1 = 'Nurses run'
    str1 = str1.lower().replace(" ","")
    ans = check_palindrome(str1 , 0 , len(str1) - 1)

    print(ans)
if __name__ == "__main__":
    main()