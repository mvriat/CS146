import java.util.*;

public class LevelTraversal 
{
	 public static List<List<Integer>> levelOrder(TreeNode root) 
	 {
		 if (root == null)
		 {
			 return null;
		 }
		 List<List<Integer>> levels = new ArrayList<List<Integer>>();
		 List<Integer> values = new ArrayList<Integer>();
		 values.add(root.val);
		 levels.add(values);
		 List<TreeNode> pop = new ArrayList<TreeNode>();
		 pop.add(root);
		 while (!pop.isEmpty())
		 {
			 int l = pop.size();
			 for (int i = 0; i < l; i++)
			 {
				 TreeNode current = pop.remove(0);
				 if(current.left != null)
				 {
					 pop.add(current.left);
				 }
				 if(current.right!= null)
				 {
					 pop.add(current.right);
				 }
			 }
			 List<Integer> popped = new ArrayList<Integer>();
			 for (TreeNode node : pop)
			 {
				 popped.add(node.val);
			 }
			 if(!popped.isEmpty())
			 {
				 levels.add(popped);
			 }
		 }
		 return levels;
	 }
	 public static void main(String[] args)
	 {
		 TreeNode root = new TreeNode(8);
		 root.left = new TreeNode(4);
		 root.left.left = new TreeNode(2);
		 root.left.right = new TreeNode(6);
		 root.right = new TreeNode(12);
		 root.right.left = new TreeNode(10);
		 root.right.right = new TreeNode(14);
		 LevelTraversal test = new LevelTraversal();
		 System.out.println(levelOrder(root));
	 }
}
