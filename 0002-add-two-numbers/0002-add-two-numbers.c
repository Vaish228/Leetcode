/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* createNode(int val)
{
    struct ListNode * nn = (struct ListNode*)malloc(sizeof(struct ListNode));
    nn->val=val;
    nn->next=NULL;
    return nn;
} 

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode * head = createNode(0);
    struct ListNode *l3 = head;
    int car = 0;

    while(l1 || l2 || car){
        int s = car;
        if(l1){
            s += l1->val;
            l1 = l1->next;
        }
        if(l2){
            s += l2->val;
            l2 = l2->next;
        }
        car = s/10;
        l3->next = createNode(s%10);
        l3 = l3->next;
    }
    struct ListNode *r = head->next;
    free(head);
    return r;
}