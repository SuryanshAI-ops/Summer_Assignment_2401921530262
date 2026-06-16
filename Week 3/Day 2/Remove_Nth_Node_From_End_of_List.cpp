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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head==NULL || head->next==NULL) return NULL;
        ListNode* temp= head;
        ListNode* deleteNode= head;

        for(int i=0;i<n;i++){
             temp=temp->next;
        }
        if(temp==NULL) {
            ListNode* temp=head;
            head=head->next;
            delete temp;
            return head;
        }
        while(temp->next!= NULL){
            deleteNode=deleteNode->next;
            temp=temp->next;
        }
        ListNode* del=deleteNode->next;
        deleteNode->next=deleteNode->next->next;

        delete del;
        return head;
    }
};