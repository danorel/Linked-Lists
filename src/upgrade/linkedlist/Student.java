package upgrade.linkedlist;

public class Student {
    private static int StudentCounter = 0;
    private int age;
    private String name;
    private String surname;

    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}
