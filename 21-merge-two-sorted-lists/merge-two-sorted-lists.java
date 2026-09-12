class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = null;
        ListNode tail = null;

        while (list1 != null && list2 != null) {

            ListNode newnode;

            if (list1.val < list2.val) {
                newnode = list1;
                list1 = list1.next;
            }
            else {
                newnode = list2;
                list2 = list2.next;
            }

            if (head == null) {
                head = tail = newnode;
            }
            else {
                tail.next = newnode;
                tail = newnode;
            }
        }

        if (head == null) {
            if (list1 != null)
                return list1;
            else
                return list2;
        }

        if (list1 != null)
            tail.next = list1;

        if (list2 != null)
            tail.next = list2;

        return head;
    }
}