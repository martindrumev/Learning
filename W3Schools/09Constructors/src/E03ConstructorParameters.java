public class E03ConstructorParameters {
    int modelYear;
    String modelName;

    public E03ConstructorParameters(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        E03ConstructorParameters myCar = new E03ConstructorParameters(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
