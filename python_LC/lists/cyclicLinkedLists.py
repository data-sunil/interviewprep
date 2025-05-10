class listnode:
    def __init__(self,data):
        self.data=data
        self.next=None
    def __str__(self):
        return f"{self.data}"

def printlist(root):
    counter = 50
    while(root!=None and counter>0):
        print(root.data)
        root=root.next
        counter-=1
                

root=None
cur=None
isCyclic = False
for i in range(1,26):
    if(root==None):
        root=listnode(i)
        cur=root
    else:
        cur.next=listnode(i)
        cur=cur.next
if(isCyclic):cur.next=root

#printlist(root)

sp=root
fp=root.next

cyclic=False
while(fp!=None and sp!=None):
    print(f"sp is {sp.data}, fp is {fp.data}")
    if fp==sp:
        cyclic=True
        break
    elif sp.next is not None and fp.next is not None:
        sp = sp.next
        fp = fp.next.next
    else :
        break
    
print(f"is linked list Cyclic? {cyclic} ")


