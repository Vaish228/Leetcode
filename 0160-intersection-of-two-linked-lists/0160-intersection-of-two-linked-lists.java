/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode func(ListNode A, ListNode B, int diff){
        while(diff>0){
            A=A.next;
            diff--;
        }
        while(A!=null && B!=null){
            if(A==B) return A;
            else{
                A=A.next;
                B=B.next;
            }
        }
        return null;

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        int n1=0, n2=0;
        while(A!=null){
            A=A.next;
            n1++;
        }
        while(B!=null){
            B=B.next;
            n2++;
        }

        if(n1>n2)
            return func(headA, headB, n1-n2);
        else
            return func(headB, headA, n2-n1);    
    }
}