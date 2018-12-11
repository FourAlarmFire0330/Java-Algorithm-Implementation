public class Stack<Item> {
    private Node first;
    private int N;
    private class Node
    {
        Item item;
        Node next;
    }
    public boolean isEmpty() {  return first == null;   }
    public int size() {     return N;   }

    public void push(Item item)
    {   // Add Element to the top of the Stack
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop()
    {   //  Remove Element from the top of the Stack
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}

