
def possible_substring(string):
    lst = []
    for i in range(len(string)):
        for j in range(i+1 , len(string)+1):
            lst.append(string[i:j])
    return lst

def main():
    string = 'Banana'
    lst = possible_substring(string)
    print(lst)

if __name__ == "__main__":
    main()