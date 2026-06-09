# def fibonacci(num , cnt , a , b):
#     if cnt >= num:
#         return a+b
    
#     c = a+b
#     a = b
#     b = c
#     cnt = cnt + 1
#     return fibonacci(num , cnt , a , b)

class solution:
    def fibonacci(self , num : int)->int:
        if num==0 or num ==1 :
            return num
        
        return self.fibonacci(num - 1) + self.fibonacci(num-2)

def main():
    num = 7
    # cnt = 2
    # a = 0 
    # b = 1
    sol = solution()
    ans = sol.fibonacci(num )

    print(f"{num}th number of series is : {ans}")
if __name__ == "__main__":
    main()