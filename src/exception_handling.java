public class exception_handling {
    public static void main(String[] args) {
        int arr[] = new int[7];
        int a=0;
        try {
            try{
                a = 22/0;
                System.out.println(a);
            } catch (Exception e) {
                System.out.println("Arithmetic Exception");
            }
            arr[8] = a;
        } catch (Exception e) {
            System.out.println("Array Index Out Of Bounds Exception");
        } finally {
            System.out.println("I got it");
        }
    }
}
