"""
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * Eg: nums = [2,11,7,15], target = 9, output [0,2]
 * Eg: nums = [3,2,4], target = 6, output [1,2]
"""
input = [2,11,7,15]
target=9

def loopMethod(input,target):
    output=None
    for i in range(len(input)):
        for j in range(i+1,len(input)):
            if (input[i]+input[j])==target:
                output=(i,j)
                break
    print(f"Loop method output is {output}")
    
loopMethod(input,target)

def dictMethod(input,target):
    output=None
    mydict = dict();
    for i in range(len(input)):
        key = target-input[i]
        if key in mydict:
            output=(i,mydict[key])
            break
        else:
            mydict[input[i]]=i
    print(f"Dictionary method output is {output}")

dictMethod(input,target)