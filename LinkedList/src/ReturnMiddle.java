public class ReturnMiddle {
    //  Given a non-empty, singly linked list with head node head, return a middle node of linked list.
    //  If there are two middle nodes, return the second middle node.
    public class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node method1(Node head) {
        // define two pointers, the fast one will always double the speed of the slow one
        //  when the fast pointer reach the end of the List, the slow pointer must point to the middle.
        Node fastPointer = head;
        Node slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        return slowPointer;
    }

    public Node method2(Node head)
    {
        // Put the LinkedList into a Array, get the middle element by Index
        Node[] linkedList = new Node[100];
        int index = 0;
        while (head != null)
        {
            linkedList[index] = head;
            head = head.next;
            index++;
        }

        return linkedList[index/2];
    }
}
