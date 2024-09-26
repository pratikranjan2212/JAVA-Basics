// import bank;

// Class
class Student {
    String name;
    int age;
    
    // Method Overriding or Compile time polymorphism
    public void printInfo(String name) {
        System.out.println(this.name);
    }
    public void printInfo(int age) {
        System.out.println(this.age);
    }
    public void printInfo(String name, int age) {
        System.out.println(this.name + " " + this.age);
    }

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Pen{
    String color;
    int price;
    
    public void penInfo() {
        System.out.println(this.color);
        System.out.println(this.price);
    }

    // Copy Constructors 
    Pen(){}
    Pen(Pen p2) {
        this.color = p2.color;
        this.price = p2.price;
    }
}

// Inheritance and Abstraction
abstract class Shape {    // Base class or Parent class
    public void printArea() {                 // non Abstract method
        System.out.print("Area is: ");
    }
}

// Single Level Inheritance
class Triangle extends Shape {    // Derived class or Child class
    int base, height;

    public void printArea(int base, int height) {
        System.out.println(0.5 * base * height);
    }
}

// Multilevel Inheritance
class EquilateralTriangle extends Triangle {   // Derived class of Triangle
    public void printArea(int side) {
        System.out.println(0.433 * side * side);
    }
}

// Hierarchical Inheritance
class Rectangle extends Shape {    // Derived class of Shape
    int length, breadth;

    public void printArea(int length, int breadth) {
        System.out.println(length * breadth);
    }
}

// Hybrid Inheritance
class Square extends Rectangle {    // Derived class of Rectangle
    public void printArea(int side) {
        System.out.println(side * side);
    }
}

// Multiple Inheritance
class Circle extends Shape {    // Derived class of Shape
    int radius;

    public void printArea(int radius) {
        System.out.println(3.14 * radius * radius);
    }
}

// Interface
interface Animal {
    int eyes = 2;
    void walk(); // By default abstract and public
}

interface Hervivore {
    void eatGrass();
}

class Horse implements Animal, Hervivore {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student("Jane", 20);
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);

        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.price = 10;
        
        Pen p2 = new Pen(p1);
        p2.penInfo();

        Triangle t1 = new Triangle();
        t1.printArea(10, 20);

        EquilateralTriangle et1 = new EquilateralTriangle();
        et1.printArea(10);

        Rectangle r1 = new Rectangle();
        r1.printArea(10, 20);

        Square square1 = new Square();
        square1.printArea(20);

        Circle circle1 = new Circle();
        circle1.printArea(10);

        // bank.Account a1 = new bank.Account();
        // a1.name = "John";
    }
}

