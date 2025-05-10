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
 
def haspoints(i,j,points):
    return points.count((i,j))==0
def reccursivelyFindIslands(i,j,m,n,mylist,points):
    if(mylist[i][j]==0):
        points.append((i,j))
    else: return
    if(i-1>=0 and haspoints(i-1,j,points)):
        reccursivelyFindIslands(i-1,j,m,n,mylist,points)
    if(i+1<m and haspoints(i+1,j,points)):
        reccursivelyFindIslands(i+1,j,m,n,mylist,points)
    if(j-1>=0 and haspoints(i,j-1,points)):
        reccursivelyFindIslands(i,j-1,m,n,mylist,points)
    if(j+1>=0 and haspoints(i,j+1,points)):
        reccursivelyFindIslands(i,j+1,m,n,mylist,points)
        
mylist = [
    [1,0,1,1,1],
    [1,0,0,0,1],
    [1,1,1,1,1],
    [1,0,1,1,1]
]
points = []
m=4
n=5
counter=0
for i in range(m):
    for j in range(n):
        found = haspoints(i,j,points)
        if(found):
            if mylist[i][j]==0:
                reccursivelyFindIslands(i,j,m,n,mylist,points)
                counter+=1

print(f"Number of dynamic islands are {counter}")
    