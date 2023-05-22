import java.util.*;
public class dellinklist {
     class solution<ListNode> {
         public <listNode> listNode removeNthFromEnd(listNode head, int n){
             if(head == null){
               return null;
             }
             int size =0;
             ListNode curr = (ListNode) head;
             while(curr !=null){
                 curr =curr.next;
                 size++;
             }
             int indexToSearch = size-n;
             listNode prev =head;
             int i =1;
             while (i<indexToSearch){
                 prev =prev.next;
                 i++;
             }
             prev.next =prev.next.next;
             return head;
         }

    }
}
