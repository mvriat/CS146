
public class ValidChecker 
{
	public static boolean isValidBST(TreeNode root)
	{
		boolean validity = isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		return validity;
	}
	static boolean isBST(TreeNode root, int min,int max)
	{
		if (root == null)
		{
			return true;
		}
		if (root.val <= min || root.val >= max)
		{
			return false;
		}
		return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
		
	}
	public static void main(String[] maria)
	{
		TreeNode root = new TreeNode(8);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(12);
		root.right.left = new TreeNode(11);
		root.right.right = new TreeNode(13);
		ValidChecker moo = new ValidChecker();
		System.out.println(ValidChecker.isValidBST(root));
	}
}
