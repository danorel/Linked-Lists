package upgrade.linkedlist;

public class DoublyLinkedList {

    private Node HEAD;
    private Node TAIL;
    private Node TEMP;

    public DoublyLinkedList(Object value){
        HEAD = new Node(value);
        TAIL = HEAD;
    }

    public void add(Object value){
        TAIL.next = new Node(value);
        TEMP = TAIL;
        TAIL = TAIL.next;
        TAIL.previous = TEMP;
        TAIL.next = null;
    }

    public void removeTAIL(){
        TAIL = TAIL.previous;
        TAIL.next = null;
    }

    public void removeHEAD(){
        HEAD = HEAD.next;
        HEAD.previous = null;
    }

    public void showDoublyLinkedList(){
        Node Current = HEAD;
        while(Current != null){
            System.out.print(Current.value + " <-> ");
            Current = Current.next;
        }
        System.out.print("null");
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
