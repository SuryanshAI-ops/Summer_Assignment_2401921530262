/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Codec {
public:

    void serializeHelper(TreeNode* root, string &s) {
        if (!root) {
            s += "N,";
            return;
        }

        s += to_string(root->val) + ",";
        serializeHelper(root->left, s);
        serializeHelper(root->right, s);
    }

    string serialize(TreeNode* root) {
        string s;
        serializeHelper(root, s);
        return s;
    }

    TreeNode* deserializeHelper(vector<string>& nodes, int &index) {
        if (nodes[index] == "N") {
            index++;
            return nullptr;
        }

        TreeNode* root = new TreeNode(stoi(nodes[index++]));

        root->left = deserializeHelper(nodes, index);
        root->right = deserializeHelper(nodes, index);

        return root;
    }

    TreeNode* deserialize(string data) {
        vector<string> nodes;
        string temp;

        for (char c : data) {
            if (c == ',') {
                nodes.push_back(temp);
                temp.clear();
            } else {
                temp += c;
            }
        }

        int index = 0;
        return deserializeHelper(nodes, index);
    }
};