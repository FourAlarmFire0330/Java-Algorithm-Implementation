public class ReverseList {
    // Reverse the given LinkedList head
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    //  Using iteration method
    public Node reverseIteration(Node head)
    {
        Node first = head;
        //  The new LinkedList after reversing
        Node reverse = null;

        while (first != null)
        {
            Node second = first.next;
            first.next = reverse;
            reverse = first;
            first = second;
        }

        return reverse;
    }

    // Using recursive method
    public Node reverseRecursive(Node head)
    {

    }
}
