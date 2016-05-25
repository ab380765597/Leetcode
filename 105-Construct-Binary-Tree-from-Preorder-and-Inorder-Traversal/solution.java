/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length!=inorder.length){
            return null;
        }
        int length = preorder.length;
        return build(preorder, 0, length-1, inorder, 0, length-1);
    }
    private int findPos(int[] arr, int start, int end, int target){
        int i;
        for(i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    private TreeNode build(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend){
        if(instart>inend){
            return null;
        }
        TreeNode root = new TreeNode(preorder[prestart]);
        int pos = findPos(inorder, instart, inend, preorder[prestart]);
        TreeNode left = build(preorder, prestart+1, pos-instart+prestart, inorder, instart, pos-1);
        TreeNode right = build(preorder, preend-(inend-pos)+1, preend, inorder, pos+1, inend);
        root.left = left;
        root.right = right;
        return root;
    }
}