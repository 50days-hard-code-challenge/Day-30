Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
  class Solution {
   
    public List<List<Integer>> levelOrder(TreeNode root) {
         Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null){
            return ans;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            // Declare a ArrayList 
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i<size; i++){
                if(queue.peek().left != null){
                    queue.add(queue.peek().left);

                }
                if(queue.peek().right!=null){
                    queue.add(queue.peek().right);
                }
                temp.add(queue.remove().val);
            }
            ans.add(temp);
        }
            return ans;
  }
    
}



Sample Input 1:
10 20 30 40 50 -1 60 -1 -1 -1 -1 -1 -1 
Sample Output 1:
10 
20 30 
40 50 60 

  public class Solution {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
		
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			BinaryTreeNode<Integer> current = q.poll();

			if(current == null){
				System.out.println();
			
			if(!q.isEmpty()){
				q.add(null);
			}
			}
			else{
				System.out.print(current.data+" ");

				if(current.left!=null){
					q.add(current.left);
				}
				if(current.right!=null){
					q.add(current.right);
				}
			}
		}
	}
	
}
