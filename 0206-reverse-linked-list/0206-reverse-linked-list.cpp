/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(!head || !head->next)
           return head;
        ListNode * t = head;
        ListNode * p = NULL;
        ListNode * c = NULL;

        while(t != NULL)
        {
           c = t->next;
           t->next = p;
           p = t;
           t = c; 
        }
        //t = head;
        return p;
    }
};