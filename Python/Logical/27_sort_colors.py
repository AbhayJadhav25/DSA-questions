def sort_colors(lst):
    low ,mid , high= 0 ,0, len(lst)-1
    while(mid<=high):
        if lst[mid]==0:
            lst[low] , lst[mid] = lst[mid],lst[low]
            low+=1
            mid+=1

        elif lst[mid]==1:
            mid+=1

        else :
            lst[mid] ,lst[high] = lst[high],lst[mid]
            high-=1
        
lst = [1,0,2,0,1,2,0]
sort_colors(lst)
print(lst)