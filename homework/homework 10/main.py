from typing import Optional, List
from collections import deque


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class LevelTraversal:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        answer = []
        if root is None:
            return None
        queue = deque()
        queue.append(root)
        while queue:
            l = len(queue)
            thisLevel = []
            for _ in range(l):
                current = queue.popleft()
                thisLevel.append(current.val)
                if current.left:
                    queue.append(current.left)
                if current.right:
                    queue.append(current.right)
            answer.append(thisLevel)

        return answer


if __name__ == "__main__":
    root = TreeNode(8)
    root.left = TreeNode(4)
    root.left.left = TreeNode(2)
    root.left.right = TreeNode(6)
    root.right = TreeNode(12)
    root.right.left = TreeNode(10)
    root.right.right = TreeNode(14)
    test = LevelTraversal()
    answer = test.levelOrder(root)
    for level in answer:
        print(level)

