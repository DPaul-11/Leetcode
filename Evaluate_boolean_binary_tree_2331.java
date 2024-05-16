package Leetcode;
import java.util.*;

public class Evaluate_boolean_binary_tree_2331 {
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
    public boolean evaluateTree(TreeNode root) {
        if(root.left==null && root.right==null)
        {
            if(root.val==1)
            {
                return true;
            }else{
                return false;
            }
        }
        boolean left=evaluateTree(root.left);
        boolean right=evaluateTree(root.right);
        if(root.val==2)
        {
            return left || right;
        }else{
            return left && right;
        }
    }
}
