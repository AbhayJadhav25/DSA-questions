#03_longest_substring_with_K_uniques.py

def solution(s,k):
    n = len(s)
    low , high , res = 0,0,float('-inf')
    dict = {}

    for high in range(n):
        dict[s[high]] = dict.get(s[high],0)+1

        while(len(dict) > k):
            dict[s[low]]-=1

            if dict[s[low]] == 0:
                del dict[s[low]]

            low+=1

        if len(dict)==k:
            res = max(res , high -low+1)

    if res == float('-inf') :
        return -1
    else:
        return res

def main():
    s = "ab"
    k = 3
    ans = solution(s ,k)
    print(ans)
if __name__ == "__main__":
    main()