class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        if(matrix.empty()) return {};
        vector<int> ans;
        int row =matrix.size();
        int col= matrix[0].size();
        int count=0;
        int total= row*col;
        int stRow=0,stCol=0, enRow=row-1, enCol=col-1;
        while(count< total){
            //Printing starting row
            for(int i=stCol;count<total && i<=enCol;i++){
                ans.push_back(matrix[stRow][i]);
                count++;
            }
            stRow++;
             //Printing ending col
            for(int i=stRow; count<total && i<=enRow;i++){
                ans.push_back(matrix[i][enCol]);
                count++;
            }
            enCol--;
             //Printing ending row
            for(int i=enCol; count<total && i>=stCol;i--){
                ans.push_back(matrix[enRow][i]);
                count++;
            }
            enRow--;
             //Printing starting col
            for(int i=enRow; count<total && i>=stRow;i--){
                ans.push_back(matrix[i][stCol]);
                count++;
            }
            stCol++;
        }
        return ans;
    }
};