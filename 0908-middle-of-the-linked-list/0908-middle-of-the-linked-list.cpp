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
 #include <cmath>
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
       if(head==NULL) return head;
       ListNode * t = head;
       int l=0;
       while(t!=NULL){
        t=t->next;
        l++;
       }   
       int j = (l/2);
       t=head;
       for(int i=0;i<j;i++)
       {
         t=t->next;
       }
       return t;
    }
};