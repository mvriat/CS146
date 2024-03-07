class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):
        self.val = val

        self.left = left

        self.right = right


class findLCA:
    def lowestCommonAncestor(self, root, p, q):
        parentValue = root.val
        pValue = p.val
        qValue = q.val
        if pValue > parentValue and qValue > parentValue:
            return self.lowestCommonAncestor(root.right, p, q)
        elif pValue < parentValue and qValue < parentValue:
            return self.lowestCommonAncestor(root.left, p, q)
        else:
            return root


if __name__ == "__main__":
    root = TreeNode(5)
    root.left = TreeNode(3)
    root.left.left = TreeNode(1)
    root.left.right = TreeNode(4)
    root.right = TreeNode(8)
    root.right.left = TreeNode(6)
    root.right.left.right = TreeNode(7)
    root.right.right = TreeNode(9)
    p = root.right.left
    q = root.right.left.right
    tree = findLCA()
    answer = tree.lowestCommonAncestor(root, p, q)
    print(answer.val)

