// Link: https://leetcode.com/problems/merge-two-sorted-lists
package leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Questao21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode orderedList = new ListNode();
        ListNode currentPos = orderedList;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentPos.next = list1;
                list1 = list1.next;
            } else {
                currentPos.next = list2;
                list2 = list2.next;
            }
            currentPos = currentPos.next;
        }
        if (list1 == null) {
            currentPos.next = list2;
        }
        if (list2 == null) {
            currentPos.next = list1;
        }

        return orderedList.next;
    }
}