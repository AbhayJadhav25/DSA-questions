def equilibrium_point(lst):
    leftsum = 0
    total = sum(lst)
    for i in range(len(lst)):
        rightsum = total -leftsum - lst[i]

        if rightsum == leftsum:
            return i

        leftsum+=lst[i]

    return -1

def main():
    lst = [1,2,0,3]
    ans = equilibrium_point(lst)
    print(f' Equilibrium point is {ans}')
if __name__ == "__main__":
    main()