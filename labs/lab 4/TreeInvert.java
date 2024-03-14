
public class TreeInvert {
	public static TreeNode invertTree(TreeNode root) 
	{
		if (root == null)
		{
			return null;
		}
		invertTree(root.left);
		invertTree(root.right);
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		return root;
		//pretty classic swapping example
    }
	public static void main(String[] poop)
	{
		TreeNode root = new TreeNode(8);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(12);
		root.right.left = new TreeNode(11);
		root.right.right = new TreeNode(13);
		TreeInvert maria = new TreeInvert();
		System.out.print(invertTree(root).val);
	}
}
