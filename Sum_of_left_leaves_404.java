package Leetcode;
import java.util.*;

public class Sum_of_left_leaves_404 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);

        Sum_of_left_leaves_404 ob=new Sum_of_left_leaves_404();
        System.out.println(ob.sumOfLeftLeaves(root));

    }
    public static class TreeNode {
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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root==null)
        {
            return 0;
        }
        if(root.left!=null)
        {
            if(root.left.left==null && root.left.right==null)
            {
                sum+=root.left.val;
            }else{
                sum+=sumOfLeftLeaves(root.left);
            }
        }
        sum+=sumOfLeftLeaves(root.right);
        return sum;
    }
}
