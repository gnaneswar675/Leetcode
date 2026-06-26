/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
    }
    public ListNode findkthnode(ListNode temp,int k){
        k--;
        while(temp!=null && k>0){
            temp=temp.next;
            k--;
        }
        return temp;

    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head,prev=null;
        while(temp!=null){
            ListNode kthnode=findkthnode(temp,k);
            if(kthnode==null){
                if(prev!=null){
                    prev.next=temp;
                    break;
                }
            }
            ListNode nextnodes=kthnode.next;
            kthnode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthnode;
            }
            else{
                prev.next=kthnode;
            }
            prev=temp;
            temp=nextnodes;
           

        }



        return head;
    }
}