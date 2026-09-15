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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int size1=size(head);
       if(n==size1)
       {
        return head.next;
       }
       ListNode temp=head;
       int i=1;
       int loop=size1-n;
       while(i<loop)
       {
        i++;
        temp=temp.next;
       }
       temp.next=temp.next.next;
       return head;
    }
    public int size(ListNode head)
    {
        ListNode temp=head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        return size;
    }
}