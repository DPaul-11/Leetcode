package Leetcode;

public class Merge_nodes_bw_zeroes_2181 {
    public static void main(String[] args) {
        
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode();
        ListNode curr=dummy;
        head=head.next;
        int sum=0;
        while(head!=null)
        {
            if(head.val==0)
            {
                curr.next=new ListNode(sum);
                curr=curr.next;
                sum=0;
            }
            sum+=head.val;
            head=head.next;
        }
        return dummy.next;
    }
}
