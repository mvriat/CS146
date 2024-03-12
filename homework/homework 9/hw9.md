For lowest common ancestor, I used a recursive method that continues on with comparisons closer and closer to the answer. We check if p and q are both greater than the root to start, and if this is true,
then we go on to compare p and q with root.right. We can disregard the left side since both p and q were greater than the root. This works the other way around, if p an q were less than the root, you call
lowestCommonAncestor again but with root.left. Here you go on down the tree until the program does a comparison with the node its at and its right in between p and q. It could be p < root.right.right.left > q 
for example. It's pretty simple to picture since we're basically just going down the tree and eliminating a lot of other possible answers each time.
