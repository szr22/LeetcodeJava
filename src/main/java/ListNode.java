public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(val);
        ListNode cur = next;
        while (cur != null) {
            str.append(cur.val);
            cur = cur.next;
        }
        return String.valueOf(str);
    }
}
