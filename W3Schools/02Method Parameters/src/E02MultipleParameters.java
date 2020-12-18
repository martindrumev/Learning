public class E02MultipleParameters {
    static void myMethod(String fName, int age) {
        System.out.println(fName + " is " + age);
    }

    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }
}
