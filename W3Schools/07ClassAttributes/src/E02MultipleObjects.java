public class E02MultipleObjects {
    int x = 5;

    public static void main(String[] args) {
        E02MultipleObjects myObj1 = new E02MultipleObjects();   // Object 1
        E02MultipleObjects myObj2 = new E02MultipleObjects();   // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
