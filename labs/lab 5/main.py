class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class ValidChecker:
    @staticmethod
    def isValidBST(root):
        validity = ValidChecker.isBST(root, float('-inf'), float('inf'))
        return validity

    @staticmethod
    def isBST(root, min_val, max_val):
        if root is None:
            return True
        if root.val <= min_val or root.val >= max_val:
            return False
        return ValidChecker.isBST(root.left, min_val, root.val) and ValidChecker.isBST(root.right, root.val, max_val)


if __name__ == "__main__":
    root = TreeNode(8)
    root.left = TreeNode(4)
    root.left.left = TreeNode(3)
    root.left.right = TreeNode(5)
    root.right = TreeNode(12)
    root.right.left = TreeNode(11)
    root.right.right = TreeNode(13)
    print(ValidChecker.isValidBST(root))

