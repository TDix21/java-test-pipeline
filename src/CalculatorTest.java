public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        if (calc.add(2, 3) == 5) {
            System.out.println("Add test passed!");
        } 
        else {
            System.out.println("Add test failed!");
        }

        if (calc.subtract(5, 3) == 2) {
            System.out.println("Subtract test passed!");
        } 
        else {
            System.out.println("Subtract test failed!");
        }
        if (calc.subtract(5, 3) == 2) {
            System.out.println("Subtract test passed!");
        } 
        else {
            System.out.println("Subtract test failed!");
        }
        if (calc.multiply(5, 3) == 15) {
            System.out.println("Multiply test passed");
        }
        else {
            System.out.println("Multiply test failed!");
        }
    }
}