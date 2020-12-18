public class E01Constructor {
    int x;

    // Class constructor for the Main class
    public E01Constructor() {

        x = 5;
    }

    public static void main(String[] args) {
        E01Constructor myObj = new E01Constructor(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x);
    }
}
