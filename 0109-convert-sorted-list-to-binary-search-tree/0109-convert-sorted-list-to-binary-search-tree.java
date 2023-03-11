/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return new TreeNode(head.val);
        ListNode turtoise=head;
        ListNode hare=head.next.next;
        while(hare!=null && hare.next!=null){
            turtoise=turtoise.next;
            hare=hare.next.next;
        }
        
        TreeNode root=new TreeNode(turtoise.next.val);
        ListNode rightSubtree=turtoise.next.next;
        turtoise.next=null;
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(rightSubtree);
        return root;
    }
}

/*
using floyd cycle's method, we use two pointers one is fast (hare) one is slow(turtoise)
we make fast run two steps and slow run 1 step
until we reach end of list, turtoise will point to the element just before the root of the tree(mid elemenet) because we need the tree to be balanced, now we dont need the fast pointer, using recursion we pass the the function the left subtree after separating it by making slow.next=null and then passing the right subtree, we also set returns of the two previous functions to root left and right children respectively.

*/