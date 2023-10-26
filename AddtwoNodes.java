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
public class AddtwoNodes {
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(0);
    ListNode current = result;
    int overflow = 0;
    while(l1 != null || l2 != null){
        int sum = 0;
        sum += l1 != null ? l1.val : 0;
        sum += l2 != null ? l2.val : 0;
        sum += overflow;
        overflow = 0;
        while(sum >= 10){
            sum -= 10;
            overflow++;
        }
        current.val = sum;
        l1 = l1 != null ? l1.next : null;
        l2 = l2 != null ? l2.next : null;
        if(l1 == null && l2 == null){
            current.next = overflow > 0 ? new ListNode(overflow) : null;
        }else{
            current.next = new ListNode(0);
        }
        current = current.next;
    }
    return result;
}
}
