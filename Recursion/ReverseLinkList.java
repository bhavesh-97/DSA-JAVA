class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkList {
    Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void printList() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }
}

public class ReverseLinkList {
    public static Node ReverseLinkedList(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node newHead = ReverseLinkedList(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        MyLinkList list = new MyLinkList();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(50);
        list.append(90);
        list.append(70);

        list.printList();

        list.head = ReverseLinkedList(list.head);

        list.printList();
    }
}