Two ways to solve this problem:
1. use stack and LinkedList. stack is used to store the nodes. The order should be root node to list -> right-> left
2. Use recursive way to get the result. 
order should be root.val-> addAll(left)->addAll(right);

pre-order traversal should be root->left->right