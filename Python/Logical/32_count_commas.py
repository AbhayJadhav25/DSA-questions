def count_commas(n):
    total = 0
    ranges = [
        (1000 , 9999 , 1) , 
        (10000 , 99999 , 1) , 
        (100000 , 999999 , 2) , 
        (1000000 , 9999999 , 2) , 
        (100000000 , 999999999 , 3) , 
    ]

    for low , high , commas in ranges:
        if n>=low:
         total += (min(n , high) - low + 1) * commas

    return total

print(count_commas(1002))