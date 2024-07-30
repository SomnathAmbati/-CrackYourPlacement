class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode();
        ListNode anst = temp;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                    anst.next = list1;
                    list1 = list1.next;
            }else{
                    anst.next = list2;  
                    list2 = list2.next;
            }
            anst = anst.next;
        }
        if (list1 != null) {
            anst.next = list1;
        } 
        else{
            anst.next = list2;
        }
        return temp.next;
    }
}