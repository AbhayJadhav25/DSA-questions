def count_substr(str , substr):
    cnt = 0
    for i in range(0 , (len(str)-len(substr))+1):
        word = str[i : i +len(substr)]
        if word == substr:
            cnt+=1
    return cnt

def main():
    str = 'ABCDCDC'
    substr = 'CDC'

    count = count_substr(str , substr)
    print(count)
if __name__ == "__main__":
    main()