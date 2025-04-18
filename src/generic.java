public class generic {
    public static void main(String[] args){
        F<Integer> obj = new F<>(15, 20);
        obj.show(17, 27);
    }
}

class F<T>{
    T a, b;

    void show(T a, T b){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    F(T a1, T b1){
        a=a1;
        b=b1;
    }
}