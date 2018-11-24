package upgrade.linkedlist;

public class Tester {
    public static void main(String[] args) {
        new Tester().run();
    }

    private void run() {

        DoublyLinkedList linkedList = new DoublyLinkedList(5);
        linkedList.add("Number");
        linkedList.add('d');
        linkedList.add(new Student("Daniel", "Orel", 17));
        linkedList.showDoublyLinkedList();

        System.out.println();
        linkedList.removeNodeWithKey('d');
        linkedList.showDoublyLinkedList();
    }
}
