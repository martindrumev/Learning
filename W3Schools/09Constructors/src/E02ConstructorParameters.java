public class E02ConstructorParameters {
    int x;

    public E02ConstructorParameters(int y) {

        x = y;
    }

    public static void main(String[] args) {
        E02ConstructorParameters myObj = new E02ConstructorParameters(5);
        System.out.println(myObj.x);
    }
}
