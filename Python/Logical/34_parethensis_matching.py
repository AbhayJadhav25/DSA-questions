
def solution(s):
    stack = []
    


    # for c in s:
    #     if c in opening:
    #         stack.append(c)
    #     elif c in closing:
    #         if((c == ')' and stack[-1] != '(') or (c == ']' and stack[-1] != '[') or (c == '}' and stack[-1] != '{') or (c == '>' and stack[-1] != '<')):
    #             return False
    #         stack.pop()
    #     else:
    #         return False
            
    # if len(stack) == 0:
    #     return True
    # else:
    #     return False


    # for c in s:
    #     if c == '(' or  c == '[' or c == '{' or c == '<':
    #         stack.append(c)
    #     else:
    #         if((c == ')' and stack[-1] == '(') or (c == ']' and stack[-1] == '[') or (c == '}' and stack[-1] == '{') or (c == '>' and stack[-1] == '<')):
    #             stack.pop()
    #         else:
    #             return False
    # if len(stack) == 0:
    #     return True
    # else:
    #     return False


    opening = '({<['
    mapping = {')':'('  ,']' : '[' , '}' : '{' , '>' : '<'}

    for c in s:
        if c in opening:
            stack.append(c)
        elif c in mapping:
            if not stack or stack[-1] != mapping[c]:
                return False
            stack.pop()
        else:
            return False

    return len(stack)==0


    
def main():
    s = "{[(])}"
    ans = solution(s)
    print(ans)
if __name__ == "__main__":
    main()