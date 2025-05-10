"""/*
 * Given an array nums containing n distinct numbers in the range [0,n] 
 * return the only number in the range that is missing from the array
 * Eg: [0,1,3] output 2
 * Eg: [1,0] output 2
 * Eg: [9,6,4,2,3,5,7,0,1]
 */
"""

arr = [9,6,4,2,3,5,7,0,1]
n=len(arr)
naturalsum = (n*(n+1))/2
arrsum = sum(arr)
print(f"Only Missing Number is {int(naturalsum-arrsum)}")