public class E01ModifyAndAccess {
    int x = 5;
    int y;

    public static void main(String[] args) {
        E01ModifyAndAccess myObj = new E01ModifyAndAccess();
        myObj.x = 25;
        myObj.y = 10;
        System.out.println(myObj.x);
        System.out.println(myObj.y);
    }
}
