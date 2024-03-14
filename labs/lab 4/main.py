class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


def invertTree(root):
    if root is None:
        return None
    invertTree(root.left)
    invertTree(root.right)
    temp = root.left
    root.left = root.right
    root.right = temp
    return root


if __name__ == "__main__":
    root = TreeNode(8)
    root.left = TreeNode(4)
    root.left.left = TreeNode(4)
    root.left.right = TreeNode(5)
    root.right = TreeNode(12)
    root.right.left = TreeNode(11)
    root.right.right = TreeNode(13)
    print(invertTree(root).val)

