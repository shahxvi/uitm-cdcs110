public class LinkedList {
    private Node first; //the 1st node
    private Node last; //the last node
    private Node current; //if any

    public LinkedList() { // default constructor
        first = null; //set the linked list to null
        last = null;
        current = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertAtFront(Object insertItem) {
        Node newNode = new Node(insertItem); //create new node with value received

        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public void insertAtBack(Object insertItem) {
        Node newNode = new Node(insertItem);

        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public Object removeFromFront() {
        Object removeItem = null;

        if (isEmpty()) {
            return removeItem;
        }

        removeItem = first.data;

        if (first == last) {
            first = null;
            last = null;
        } else
            first = first.next;

        return removeItem;
    }

    public Object removeFromBack() {
        Object removeItem = null;

        if (isEmpty()) {
            return removeItem;
        }

        removeItem = last.data;

        if (first == last) {
            first = null;
            last = null;
        } else {
            current = first;
            while (current.next != last)
                current = current.next;
            last = current;
            last.next = null;
        }

        return removeItem;
    }

    public Object getFirst() {
        if (isEmpty())
            return null;
        else {
            current = first;
            return current.data;
        }
    }

    public Object getNext() {
        if (current == last)
            return null;
        else {
            current = current.next;
            return current.data;
        }
    }

    //add your getSecond() method definition here
    public Object getSecond() {
        if (isEmpty())
            return null;
        else {
            current = first.next;
            return current.data;
        }
    }
}
