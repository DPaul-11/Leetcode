package Leetcode;

public class Sum_root_to_leaf_numbers_129 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);

        Sum_root_to_leaf_numbers_129 ob=new Sum_root_to_leaf_numbers_129();
//        System.out.println(ob.sumNumbers(root));
    }
    public static class TreeNode {
        int val;
        Sum_of_left_leaves_404.TreeNode left;
        Sum_of_left_leaves_404.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, Sum_of_left_leaves_404.TreeNode left, Sum_of_left_leaves_404.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    public static int sumNumbers(TreeNode root) {
        return sumTree(root, 0);
    }
    int totalSum=0;
    public static int sumTree(TreeNode root, int sum)
    {
        if(root==null)
        {
            return 0;
        }
        sum=sum*10+root.val;
        if(root.left==null && root.right==null)
        {
            return sum;
        }
        return sumTree(root.left, sum)+sumTree(root.right, sum);
    }
}
