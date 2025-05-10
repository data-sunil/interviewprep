a = [1,2,3,4,5]

def byloops(a):
    found= False
    for i in a:
        j=len(a)-1
        while(j>i):
            if(a[i]==a[j]):
                found=True
                break
            else: j-=1
        if(found):
            break
    return found

def bySet(a):
    found=False
    myset = set(a)
    found = len(a)==len(myset)
    return not found

print(f"By loops {byloops(a)}")
print(f"By Set {bySet(a)}")
