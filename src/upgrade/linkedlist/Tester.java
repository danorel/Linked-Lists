package upgrade.linkedlist;

public class Tester {
    public static void main(String[] args) {
        new Tester().run();
    }

    private void run() {
        System.out.println("Testing doubly linked list");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(5);
        doublyLinkedList.add("Number");
        doublyLinkedList.add('d');
        doublyLinkedList.add(new Student("Daniel", "Orel", 17));
        doublyLinkedList.showDoublyLinkedList();
        System.out.println();
        doublyLinkedList.removeNodeWithKey('d');
        doublyLinkedList.addHEAD(10);
        doublyLinkedList.showDoublyLinkedList();
        System.out.println();
        System.out.println("Current size is " + doublyLinkedList.size() + ":");
        doublyLinkedList.showDoublyLinkedList();
        doublyLinkedList.removeNodeWithKey("Number");
        System.out.println();
        System.out.println("Current size is " + doublyLinkedList.size() + ":");
        doublyLinkedList.showDoublyLinkedList();
        System.out.println();

        System.out.println("Testing singly linked list");
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(5);
        singlyLinkedList.add(10);
        singlyLinkedList.showLinkedList();
        System.out.println();
        singlyLinkedList.addHEAD(8);
        System.out.println("Current size is " + singlyLinkedList.size() + ":");
        singlyLinkedList.showLinkedList();
        System.out.println();
        singlyLinkedList.removeHEAD();
        singlyLinkedList.addHEAD(1);
        singlyLinkedList.addHEAD(0);
        singlyLinkedList.showLinkedList();
        System.out.println();
        singlyLinkedList.removeList();
        singlyLinkedList.showLinkedList();
    }
}
