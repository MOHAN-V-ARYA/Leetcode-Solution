/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode temp1;
    struct ListNode *temp=&temp1;
    while(list1!=NULL && list2!=NULL){
        if(list1->val<=list2->val){
            temp->next=list1;
            list1=list1->next;
        }else{
            temp->next=list2;
            list2=list2->next;
        }
        temp=temp->next;
    }
        if(list1!=NULL){
            temp->next=list1;
        }else{
            temp->next=list2;
        }
    return temp1.next;
}