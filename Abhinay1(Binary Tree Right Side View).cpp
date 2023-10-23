class Solution {
public:
    void solve(TreeNode* root,vector<int>&ans,int l){
     if(root==NULL){
        return;
     }
     if(l==ans.size()){
        ans.push_back(root->val);
     }
     solve(root->right,ans,l+1);
     solve(root->left,ans,l+1);
    
    }
    vector<int> rightSideView(TreeNode* root) {
       vector<int>ans;
       solve(root,ans,0);
       return ans;
    }
};
