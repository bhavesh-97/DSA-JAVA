public class MergeLinkedList {
    public static Node MergeList(Node list1, Node list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.data <= list2.data) {
            list1.next = MergeList(list1.next, list2);
            return list1;
        } else {
            list2.next = MergeList(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        MyLinkList list1 = new MyLinkList();
        MyLinkList list2 = new MyLinkList();
        MyLinkList result = new MyLinkList();

        list1.append(10);
        list1.append(20);
        list1.append(30);
        list1.append(8);

        list2.append(50);
        list2.append(90);
        list2.append(70);

        // list.printList();

        result.head = MergeList(list1.head, list2.head);

        result.printList();
    }
}