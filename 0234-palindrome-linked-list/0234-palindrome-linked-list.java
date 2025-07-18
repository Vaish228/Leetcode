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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode next = null;
        ListNode curr = head;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        if(fast!=null)
            slow= slow.next;

        slow = reverse(slow);    
        while(slow!=null && head!=null){
            if(slow.val!=head.val)
                return false;
            slow = slow.next;
            head = head.next;    
        }
        return true;

    }
}