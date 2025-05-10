from functools import lru_cache
"""
 * Given an 2D array, find the number of islands
 * 
 * 1 0 1 1 1
 * 1 0 0 0 1
 * 1 1 1 1 1
 * 1 0 1 1 1
 * 
 * answer = 2
 """

def reccursivelySubstitue(i,j,m,n,mylist):
    if(mylist[i][j]==0):
        mylist[i][j]=-1
    else: return
    if(i+1<m):
        reccursivelySubstitue(i+1,j,m,n,mylist)
    if(j+1<n):
        reccursivelySubstitue(i,j+1,m,n,mylist)
    if(j-1>=0):
        reccursivelySubstitue(i,j-1,m,n,mylist)
 
# mylist = [
#     [1,0,1,1,1],
#     [1,0,0,0,1],
#     [1,1,1,1,1],
#     [1,0,1,1,1]
# ]
mylist=[
    [1,0,1,1,1],
    [1,0,1,0,1],
    [1,1,0,1,1],
    [1,0,1,1,1]
]
m=4;n=5;counter=0
for i in range(m):
    for j in range(n):
        if(mylist[i][j]==0):
            reccursivelySubstitue(i,j,m,n,mylist)
            counter+=1
print(f"Number of dynamic Islands found are {counter}")