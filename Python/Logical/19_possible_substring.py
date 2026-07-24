
def possible_substring(string):
    vowel = 0
    consontant = 0

    for i in range(len(string)):
        for j in range(i+1 , len(string)+1):
            substr = string[i:j]

            if substr[0]=='a' or substr[0]=='e' or substr[0]=='0' or substr[0]=='o' or substr[0]=='u':
                vowel+=1
            else:
                consontant+=1

    maximum = max(vowel , consontant)
    print(maximum)
def main():
    string = 'Banana'
    possible_substring(string)

if __name__ == "__main__":
    main()