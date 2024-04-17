package Leetcode;

public class Smallest_string_starting_from_leaf_988 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode('a');
        root.left=new TreeNode('b');
        root.left.left=new TreeNode('d');
        root.left.right=new TreeNode('e');
        root.right=new TreeNode('c');
        root.right.left=new TreeNode('d');
        Smallest_string_starting_from_leaf_988 ob=new Smallest_string_starting_from_leaf_988();
        System.out.println(ob.smallestFromLeaf(root));
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
    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return res;
    }
    private String res=null;
    private void dfs(TreeNode root, StringBuilder sb)
    {
        if(root==null)
        {
            return;
        }
        sb.append((char)(root.val+'a'));
        if(root.left==null && root.right==null)
        {
            final String path=sb.reverse().toString();
            sb.reverse();
            if(res==null || res.compareTo(path)>0)
            {
                res=path;
            }
        }
        dfs(root.left, sb);
        dfs(root.right, sb);
        sb.deleteCharAt(sb.length()-1);
    }
}
