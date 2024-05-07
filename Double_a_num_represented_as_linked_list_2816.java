package Leetcode;

public class Double_a_num_represented_as_linked_list_2816 {
    public static void main(String[] args) {

    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    int carry;
    public ListNode doubleIt(ListNode head) {
        carry=0;
        helper(head);
        if(carry==0)
        {
            return head;
        }else{
            return new ListNode(carry, head);
        }
    }
    public void helper(ListNode head)
    {
        if(head ==null)
        {
            return;
        }
        helper(head.next);
        int current=2*head.val+carry;
        carry=current/10;
        head.val=current%10;
    }
}
