For this problem, we're also going to use recursion. We have some base cases that checks whether the values are zero or too big/too small. After that we're using recursion for the roots children, root.left and root.right. Notice how we're going to return two boolean values, so when we pass it through isValidBST(), if one side of the tree(the recursion that goes down each nodes right and left subtrees) it will return false! This is important because even if one side it correct, it needs to return false for anything invalid.