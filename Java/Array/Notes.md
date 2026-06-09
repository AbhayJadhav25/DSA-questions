1) Two Sum
arr = [2 ,1 , 3 ,5 , 4 , 6]
target = 10

find pairs of values which sum = 10 , exactly only one solution.
Arrays pairs : (2,1),(2,3) ...... ,(2,6)
                (1,3),(1,5).......,(1,6)
                (4,6)
            i -> 0 to n-1
            j -> i+1 to n
we have to return pair of indices