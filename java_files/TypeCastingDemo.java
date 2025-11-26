public class TypeCastingDemo {
    public static void main(String[] args) {
        int intValue = 100;
        double doubleValue = intValue; 
        System.out.println("Implicit Casting - int to double: " + doubleValue);
        double price = 9.99;
        int intPrice = (int) price; 
        System.out.println("Explicit Casting - double to int: " + intPrice);
        int a = 10;
        double b = 3.0;
        double result = a / b; 
        System.out.println("Mixed expression result: " + result);
    }
}