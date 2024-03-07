
public class findLCA 
{
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
	 {
		 int parentValue = root.val;
		 int pValue = p.val;
		 int qValue = q.val;
		 
		 if (pValue > parentValue && qValue > parentValue)
		 {
			 return lowestCommonAncestor(root.right, p, q);
		 }
		 else if (pValue < parentValue && qValue < parentValue)
		 {
			 return lowestCommonAncestor(root.left, p, q);
		 }
		 else
		 {
			 return root;
		 }
	 }
	 public static void main(String args[])
	 {
		 TreeNode root = new TreeNode(5);
		 root.left = new TreeNode(3);
		 root.left.left = new TreeNode(1);
		 root.left.right = new TreeNode(4);
		 root.right = new TreeNode(8);
		 root.right.left = new TreeNode(6);
		 root.right.left.right = new TreeNode(7);
		 root.right.right = new TreeNode(9);
		 
		 TreeNode p = root.right.left;
		 TreeNode q = root.right.left.right;
		 
		 findLCA tree = new findLCA();
		 TreeNode answer = tree.lowestCommonAncestor(root, p, q);
		 System.out.println(answer.val);
	}
}
