class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
       unordered_set<int> present;

       for(int num:nums){
        if(present.count(num)){
            return true;
        }
        present.insert(num);
       }
        return false;
    }
};