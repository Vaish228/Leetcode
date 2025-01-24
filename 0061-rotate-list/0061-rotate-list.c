/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k) {
    if(head==NULL || head->next == NULL || k==0)
       return head;
    struct ListNode* temp = head;
    int l =0 ;
    while(temp->next){
        temp=temp->next;
        l++;
    }   
    temp->next=head;

    k = k%(l+1);
    int j = l-k;
    temp=head;
    while(j){
        temp=temp->next;
        j--;
    }
    struct ListNode * r = temp->next;
    temp->next = NULL;
    return r;

}