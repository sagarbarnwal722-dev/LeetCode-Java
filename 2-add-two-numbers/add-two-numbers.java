class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = null;
        ListNode tail = null;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0)
        {
            int a = (l1 != null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;

            int k = a + b + carry;

            int digit = k % 10;
            carry = k / 10;

            ListNode sum = new ListNode(digit);

            if (head == null)
            {
                head = tail = sum;
            }
            else
            {
                tail.next = sum;
                tail = sum;
            }

            if (l1 != null)
                l1 = l1.next;

            if (l2 != null)
                l2 = l2.next;
        }

        return head;
    }
}