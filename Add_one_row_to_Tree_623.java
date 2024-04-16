package Leetcode;
import java.util.*;

public class Add_one_row_to_Tree_623 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(1);
        root.right=new TreeNode(6);
        root.right.left=new TreeNode(5);
        int val=1;
        int depth=2;
        Add_one_row_to_Tree_623 ob=new Add_one_row_to_Tree_623();
        System.out.println(ob.addOneRow(root, val, depth));
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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1)
        {
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }
        insert(root, val, depth, 1);
        return root;
    }
    public void insert(TreeNode node, int val, int depth, int currDepth){
        if(node==null)
        {
            return;
        }
        if(currDepth==depth-1)
        {
            TreeNode temp=node.left;
            node.left=new TreeNode(val);
            node.left.left=temp;
            temp=node.right;
            node.right=new TreeNode(val);
            node.right.right=temp;
        }else{
            insert(node.left, val, depth, currDepth+1);
            insert(node.right, val, depth, currDepth+1);
        }
    }
}
