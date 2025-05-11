"""
/*
 * Given an array nums containing n distinct numbers in the range [1,n] 
 * Find all missing numbers in the range [1,n]
 * Eg: [1,1,3,3] output [2,4]
 * Eg: [1,1] output [2]
 * Eg: [1,2,3,4,4,3,2,1,8] output [5,6,7,9]
 */ 
"""
arr = [1,2,3,4,4,3,2,1,8]

aset = set(arr)
nset = {i for i in range(1,len(arr)+1)}

missing = nset.difference(aset)
print(f"Missing Numbers are {sorted(missing)}")