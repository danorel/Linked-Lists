package upgrade.linkedlist;

public class Tester {
    public static void main(String[] args) {
        new Tester().run();
    }

    private void run() {
//        SinglyLinkedList linkedList = new SinglyLinkedList(5);
//        int NumberOfStudents = 2;
//        Student[] students = {new Student("Daniel", "Orel", 17), new Student("Den", "Lolkin", 19)};
//        for(Student student : students){
//            linkedList.add(student);
//        }
//        linkedList.showLinkedList();
//        linkedList.removeTAIL();
//        System.out.println();
//        linkedList.showLinkedList();

        DoublyLinkedList linkedList = new DoublyLinkedList(5);
        linkedList.add("Number");
        linkedList.add('d');
        linkedList.add(new Student("Daniel", "Orel", 17));
        linkedList.showDoublyLinkedList();

        System.out.println();
        linkedList.removeTAIL();
        linkedList.showDoublyLinkedList();

        System.out.println();
        linkedList.removeHEAD();
        linkedList.showDoublyLinkedList();
    }
}
