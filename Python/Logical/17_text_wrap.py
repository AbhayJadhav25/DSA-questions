import textwrap

def wrap(string, max_width):
    result = ""
    cnt = 0
    idx = 0
    while idx != len(string):
        result = result+string[idx]
        idx +=1
        cnt+=1
        
        if cnt == max_width:
            result = result + '\n'
            cnt = 0
    return result

def main():
    print("Enter String and max_width : ")
    string, max_width = 'ABCDEFGHIJKLMN' , 4
    result = wrap(string, max_width)
    print(result)

if __name__ == '__main__':
    main()