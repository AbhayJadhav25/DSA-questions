# def solution(s):
#     n = len(s)
#     low , high = 0 , 0
#     result = 0
#     letters = {}

#     for high in range(n):
#         if letters.get(s[high],0) != 1:
#             letters[s[high]] = letters.get(s[high] , 0)+1
#         else:
#             low = s.index(s[high]) + 1
#             # letters[s[low]] = 1

#         window_len = high - low + 1
#         result = max(result , window_len)
#     return result

def solution(s):
    n = len(s)
    low , high = 0 , 0
    f = {}
    res = 0

    for high in range(n):
        f[s[high]] = f.get(s[high] , 0)+1

        k = high - low +1
        while(len(f) < k):
            f[s[low]] = f.get(s[low] , 0) - 1

            if f[s[low]] == 0:
                del f[s[low]]

            low+=1

            k = high - low +1

        window_len = high - low+1
        res = max(res , window_len)

    return res
def main():
    s = "aab"
    ans = solution(s)
    print(ans)

if __name__ == "__main__":
    main()