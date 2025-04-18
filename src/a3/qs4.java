package a3;

class Box<T> {
    T a, b;
    
    Box(T a, T b) {
        this.a = a;
        this.b = b;
    }
    
    void getData() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    
    void setData(T a) {
        this.a = a;
    }
}

public class qs4 {
    public static void main(String[] args) {
        // Experiment 1: Box with String
        System.out.println("===== String Box Experiment =====");
        Box<String> obj1 = new Box<>("Hello", "World");
        Box<String> obj2 = obj1; // Second reference to the same box
        
        System.out.println("Initial state:");
        obj1.getData();
        obj2.getData();
        
        obj2.setData("Modified String");
        System.out.println("\nAfter modifying through obj2:");
        obj1.getData();
        obj2.getData();
        
        // Experiment 2: Box with Integer
        System.out.println("\n===== Integer Box Experiment =====");
        Box<Integer> obj3 = new Box<>(42,56);
        Box<Integer> obj4 = obj3; // Second reference to the same box
        
        System.out.println("Initial state:");
        obj3.getData();
        obj4.getData();
        
        obj3.setData(99);
        System.out.println("\nAfter modifying through obj3:");
        obj3.getData();
        obj4.getData();
        
        // Experiment 3: Box with Object
        System.out.println("\n===== Object Box Experiment =====");
        Box<Object> obj5 = new Box<>("Initial", 123);
        Box<Object> obj6 = obj5; // Second reference to the same box
        
        System.out.println("Initial state:");
        obj5.getData();
        obj6.getData();
        
        // Testing with String in Object box
        System.out.println("\nPutting a String in Object box:");
        obj5.setData("String in Object box");
        obj5.getData();
        obj6.getData();
        
        // Testing with Integer in Object box
        System.out.println("\nPutting an Integer in Object box:");
        obj6.setData(123);
        obj5.getData();
        obj6.getData();
    }
}
