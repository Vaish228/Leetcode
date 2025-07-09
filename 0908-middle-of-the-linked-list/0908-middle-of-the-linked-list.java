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
    public ListNode middleNode(ListNode head) {
        // int c =0;
        // ListNode t = head;
        // while(t!=null)
        // {
        //     c++;
        //     t=t.next;
        // }
        // int m = c/2;
        // t=head;
        // for(int i=0;i<m;i++){
        //     t=t.next;
        // }
        // return t;
        ListNode s = head;
        ListNode t = head;
        while(t!=null && t.next!=null){
            s=s.next;
            t=t.next.next;
        }
        return s;
    }
}