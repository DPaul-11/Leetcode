package Leetcode;

public class Delete_leaves_with_given_value_1325 {
    public static void main(String[] args) {

    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root==null)
        {
            return null;
        }
        root.left=removeLeafNodes(root.left, target);
        root.right=removeLeafNodes(root.right, target);
        if(root.left==null && root.right==null && root.val==target)
        {
            return null;
        }
        return root;
    }
}
