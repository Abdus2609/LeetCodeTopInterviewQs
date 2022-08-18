
public class P2AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode tempHead = new ListNode(0);
        ListNode curr = tempHead;
     
        ListNode temp1 = l1;
        ListNode temp2 = l2;
     
        int carry = 0;
        while (temp1 != null || temp2 != null) {
            int sum = carry;
            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }
     
            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }

            carry = sum / 10;
            sum %= 10;
     
            ListNode node = new ListNode(sum);
            curr.next = node;
            curr = curr.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return tempHead.next;
    }
}
