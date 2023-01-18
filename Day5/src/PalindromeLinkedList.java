public class PalindromeLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {

        ListNode mid = middle(head);
        mid.next = reverse(mid.next);

        //ListNode temp = mid.next;
        mid = mid.next;

        while(mid!=null){
            if(head.val != mid.val){
                return false;
            }
            head = head.next;
            mid = mid.next;
        }
        return true;
    }

    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;

        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
