// *
//  * Definition for singly-linked list.
//  * class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) {
//  *         val = x;
//  *         next = null;
//  *     }
//  * }
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        //using floyd's algorithm
         ListNode turtoise = head; //slow pts
         ListNode hare = head; //fast ptr
        
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtoise = turtoise.next;
            
            if(turtoise==hare){
                turtoise=head;
                
                while(turtoise!=hare){
                    turtoise=turtoise.next;
                    hare=hare.next;
                }
                return turtoise;
            }
        }
        return null;
    }
}




/*

you can refer to floyd's algorithm to this video https://www.bing.com/videos/search?q=floyd%27s+cycle+detection+algorithm&&view=detail&mid=F1B59E8079C7AE75197CF1B59E8079C7AE75197C&&FORM=VRDGAR

*/
