public class DoubleNode<Item> {

    private Node<Item> firstNode;
    private Node<Item> lastNode;

    private class Node<Item> {
        private Item item;                                              // using generic data type
        private Node<Item> nextNode;                        // next pointer of the node
        private Node<Item> previousNode;                    // previous pointer of the node

        public Node(Item item)
        {   this.item = item;    }
    }

    public DoubleNode ()                           //  initialise the node
    {
        firstNode = null;
        lastNode = null;
    }

    public boolean isEmpty()
    {
        return firstNode == null;
    }

    // Add a new Node to the head of the LinkedList
    public void addFirst (Item item)
    {
        Node<Item> newLink = new Node<>(item);
        if (isEmpty())
        {
            lastNode = newLink;
            newLink.previousNode = null;
        }
        else
        {
            firstNode.previousNode = newLink;
            newLink.previousNode = null;
        }
        newLink.nextNode = firstNode;
        firstNode = newLink;
    }

    // Add a new Node to the End of the LinkedList
    public void addEnd (Item item)
    {
        Node<Item> newLink = new Node<>(item);
        if (isEmpty())
        {
            firstNode = newLink;
            newLink.previousNode = null;
        }
        else
        {
            newLink.previousNode = lastNode;
            lastNode.nextNode = newLink;
        }
        newLink.nextNode = null;
        lastNode = newLink;
    }

    //  Delete the Node at the head of the linkedList
    public void deleteFirst()
    {
        if (isEmpty())
        {
            System.out.println("It is Empty!");
        }
        else if (firstNode.nextNode == null)
        {
            lastNode = null;
        }
        else
        {
            firstNode.nextNode.previousNode = null;
        }
        firstNode = firstNode.nextNode;
    }

    //  Delete the Node at the end of the linkedList
    public void deleteEnd()
    {
        if (firstNode.nextNode == null)
        {
            firstNode = null;
        }
        else
        {
            lastNode.previousNode.nextNode = null;
        }
        lastNode = lastNode.previousNode;
    }

    // Insert a Node before the Key
    public void insertBefore(Item position, Item newValue)
    {
        Node<Item> newItem = new Node<>(newValue);
        Node<Item> cur = firstNode;
        if (firstNode.nextNode == null)
            addFirst(newValue);
        else
        {
            while (cur.nextNode.item != position)
            {
                cur = cur.nextNode;
                if (cur.nextNode == null)
                    System.out.println("No Position!");
            }

            newItem.nextNode = cur.nextNode;
            newItem.previousNode = cur;
            cur.nextNode.previousNode = newItem;
            cur.nextNode = newItem;
        }
    }

    //  Insert a Node after a specific node
    public void insertAfter(Item position, Item newValue)
    {
        Node<Item> newItem = new Node<>(newValue);
        Node<Item> cur = firstNode;

    }
}
