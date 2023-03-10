public class RemoveDuplicatesFromSortedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode cursor = head;
        if(head==null){
            return head;
        }

        while(cursor!=null && cursor.next!=null){
            if(cursor.val == cursor.next.val){
                cursor.next = cursor.next.next;
            }else{
                cursor = cursor.next;
            }
        }

        return head;

    }
}
