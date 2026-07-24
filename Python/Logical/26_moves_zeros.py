def moves_zero(lst):
    i = 0
    for j in range(1,len(lst)):
        if lst[i]==0 and lst[j]!=0:
            lst[i],lst[j] = lst[j] , lst[i]
        if lst[i]!=0:
            i+=1
        if lst[j]==0:
            j+=1
def main():
    lst = [0,1,12,0,3,4,0,1]
    moves_zero(lst)
    print(lst)
if __name__ == "__main__":
    main()