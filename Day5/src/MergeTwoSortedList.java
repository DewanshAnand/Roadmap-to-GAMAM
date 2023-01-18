public class MergeTwoSortedList {

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        if(list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        ListNode prt1 = list1.next;
        ListNode prt2 = list2;
        ListNode prt1_prev = list1;

        while(prt1 != null && prt2 != null){

            if(prt1.val > prt2.val){

                prt1_prev.next = prt2;
                prt2 = prt2.next;
                prt1_prev.next.next = prt1;
                prt1_prev = prt1_prev.next;
            } else{
                prt1 = prt1.next;
                prt1_prev = prt1_prev.next;
            }
        }

        if(prt2 != null){
            prt1_prev.next = prt2;
        }

        return list1;
    }
}
