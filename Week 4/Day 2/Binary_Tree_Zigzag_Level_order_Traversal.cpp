/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> ans;
        if(root==NULL) return ans;
        queue<TreeNode*> q;
        q.push(root);
        int c=0;

        while(!q.empty()){
            c++;
            vector<int>lvl;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode* node= q.front();
                q.pop();
                
                if(node->left!=NULL) q.push(node->left);
                if(node->right!=NULL) q.push(node->right);
                
                lvl.push_back(node->val);
                
            }
            if(c%2==1){
            ans.push_back(lvl);
            }
            else{
                reverse(lvl.begin(),lvl.end());
                ans.push_back(lvl);
            }
        }
        return ans;
    }
};