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
    public void reorderList(ListNode head) {
    //Base case
        if(head==null||head.next==null){
            return;
        }
        //middle find
        ListNode hare=head;
        ListNode turtle=head;
        while(hare!=null&&hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }

        //seperate second half
        ListNode prev=turtle;
        ListNode curr=turtle.next;
        turtle.next=null;
        //Reverse
        while(curr!=null){
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        }
     //merging 
     ListNode first=head;
     ListNode second=prev;
     while(second!=turtle){
     ListNode temp1=first.next;
     ListNode temp2=second.next;
     first.next=second;
     second.next=temp1;
     first=temp1;
     second=temp2;}

    }
}
