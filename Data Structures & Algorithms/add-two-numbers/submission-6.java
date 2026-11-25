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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;
         if(head1==null&&head2==null){
            return null;}
        if(head1==null){
            return l2;
        }
        if(head2==null){
            return l1;
        }
        //creating result
        ListNode result=null;
        ListNode tail=null;
        int carry=0;
        while(head1!=null||head2!=null||carry!=0){
            int val1=0;
            int val2=0;
            if(head1!=null){
                val1=head1.val;
            }
            if(head2!=null){
                val2=head2.val;
            }
            int sum=val1+val2+carry;
            carry=sum/10;
            int digit=sum%10;
            ListNode newNode=new ListNode(digit);

               if(result==null){
                result=newNode;
                tail=newNode;
               }
               else{
                tail.next=newNode;
                tail=newNode;
               }
               if(head1!=null){
                head1=head1.next;

               }
               if(head2!=null){
                head2=head2.next;
               }
        }
       
        return result;
        
        }
    }

