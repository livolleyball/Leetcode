public class AddTwoNumbers {

/*
给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。

    你可以假设除了数字 0 之外，这两个数字都不会以零开头。
    */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2,
                curr = dummyHead;
        int carry = 0;//进位
        //
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            System.out.println(curr);
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;

    }
    public static void main(String[] args){

    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }
}
