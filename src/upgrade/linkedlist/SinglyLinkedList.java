package upgrade.linkedlist;

public class SinglyLinkedList {

    private Node HEAD;
    private Node TAIL;

    public SinglyLinkedList(Object value){
        HEAD = new Node(value);
        TAIL = HEAD;
    }

    public SinglyLinkedList(){
        HEAD = new Node();
        TAIL = HEAD;
    }


    public void add(Object value){
        TAIL.next = new Node(value);
        TAIL = TAIL.next;
    }

    public void showLinkedList(){
        Node temp = HEAD;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void removeTAIL(){
        TAIL = null;
    }


    class Node {
        private Object value;
        private Node next;

        public Node(){
            next = null;
        }

        public Node(Object value) {
            this.value = value;
            next = null;
        }
    }
}
