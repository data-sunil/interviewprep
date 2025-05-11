package java_LC.interview.leetcode.lists;
/*
 * Given a linked list, determine if it has a cycle in it.
 */

public class CyclicLinkedList {
    private static ListNode generateLinkedList(boolean circular) {
        ListNode root = null;
        ListNode curr=null;
        ListNode circle =null;
        for(int i=1;i<=25;i++){
            if(root==null){
                root=new ListNode(i);
                curr=root;
            }
            else{
                var obj = new ListNode(i);
                curr.setNext(obj);
                if(i%13==0){
                    circle=curr;
                }
                curr = obj;
            }
        }
        if(circular)curr.setNext(circle);
        return root;
    }

    private static void printLinkedList(ListNode root) {
        int count = 50;
        while(root!=null && count >=0){
            System.out.println(root.getData());
            root = root.getNext();
            count--;
        }
    }
    public static void main(String[] args) {
        ListNode root = generateLinkedList(true);
        printLinkedList(root);
        boolean isCircular= false;
        ListNode fp,sp;
        sp=root;
        fp = root.getNext();
        int i=0;
        loop:while(sp!=null){
             if(sp.equals(fp)){
                isCircular=true;
                break;
             }
             else{
                sp=sp.getNext();
                if (fp!=null && fp.getNext()!=null)
                    fp=fp.getNext().getNext();
                else {
                    break loop;
                }
             }
        }
        System.out.println("Is list Circular? "+isCircular);
    }
}


class ListNode {
    int data;
    ListNode next;

    public ListNode(int d){
        this.data=d;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    
}
