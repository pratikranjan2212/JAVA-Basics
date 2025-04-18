package a3;

public class qs3 {
    public static void main(String[] args) {
        Student s1 = new Student("John", 190);
        try {
            s1.display();
        } catch (MarksOutofBoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Student{
    String name; int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() throws MarksOutofBoundException {
        if (marks>100)
            throw new MarksOutofBoundException("Marks cannot be more than 100");
        else
            System.out.println("Student name: " + name + ", Marks: " + marks);
    }
}

class MarksOutofBoundException extends Exception{
    MarksOutofBoundException(String str) {
        super(str);
    }
}