def lowerBound(arr: [int], n: int, x: int) -> int:
    # Write your code here
    if arr[-1]<x:
        return n
    if arr[0]>x:
        return 0
    for i in range(n):
        if arr[i]<x and arr[i+1]>=x:
            return i+1
            
    pass
