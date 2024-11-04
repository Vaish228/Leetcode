/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    if(head==NULL || head->next==NULL)
       return head;
    struct ListNode* currentNode = head;
    while(currentNode !=NULL && currentNode->next!=NULL)
    {
          if(currentNode->val == currentNode->next->val)
          {
            struct ListNode* duplicates = currentNode->next;
            currentNode->next = currentNode->next->next;
            free(duplicates);
          }
          else
          {
            currentNode = currentNode->next;
          }
    } 
    return head;    
}
