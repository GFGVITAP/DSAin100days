//Input: head = [1,3,4,7,1,2,6] ,  Output: [1,3,4,1,2,6]
//Input: head = [1,2,3,4],   Output: [1,2,4]
//Input: head = [2,1],  Output: [2]
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode slow= head;
        ListNode fast= head.next.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}