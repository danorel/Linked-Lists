package upgrade.linkedlist;

public class DoublyLinkedList {
    private Node HEAD;
    private Node TAIL;
    private int counter = 0;

    public DoublyLinkedList(){
        HEAD = new Node(null);
        TAIL = HEAD;
        counter++;
    }

    public DoublyLinkedList(Object value){
        HEAD = new Node(value);
        TAIL = HEAD;
        counter++;
    }

    public void add(Object value){
        TAIL.next = new Node(value);
        Node TEMP = TAIL;
        TAIL = TAIL.next;
        TAIL.previous = TEMP;
        TAIL.next = null;
        counter++;
    }

    public void addHEAD(Object value){
        Node TEMP = new Node(value);
        Node CURRENT = HEAD;
        HEAD = TEMP;
        HEAD.next = CURRENT;
        HEAD.previous = null;
        counter++;
    }

    public void removeTAIL(){
        if(TAIL.previous != null){
            TAIL = TAIL.previous;
            TAIL.next = null;
            counter--;
        } else {
            System.err.println("Can't remove the TAIL! Its' previous element is null");
        }
    }

    public void removeHEAD(){
        if(HEAD.next != null){
            HEAD = HEAD.next;
            HEAD.previous = null;
            counter--;
        } else {
            System.err.println("Can't remove the HEAD! Its' next element is null");
        }
    }

    public void removeDoublyLinkedList(){
        while(HEAD.next != null){
            TAIL = TAIL.previous;
            TAIL.next = null;
            counter--;
        }
    }

    public void removeNodeWithKey(Object value){
        Node TEMP = TAIL;
        Node FIX;
        while(TEMP.previous != null){
            if(TEMP.value == value){
                FIX = TEMP.next;
                TEMP = TEMP.previous;
                TEMP.next = FIX;
                break;
            } else {
                TEMP = TEMP.previous;
            }
        }
        counter--;
    }

    public void showDoublyLinkedList(){
        Node Current = HEAD;
        while(Current != null){
            System.out.print(Current.value + " <-> ");
            Current = Current.next;
        }
        System.out.print("null");
    }

    public int size(){
        return counter;
    }

    public class Node{
        private Object value;
        private Node next;
        private Node previous;

        public Node(Object value){
            this.value = value;
            this.next = null;
            this.previous = null;
        }
    }
}
