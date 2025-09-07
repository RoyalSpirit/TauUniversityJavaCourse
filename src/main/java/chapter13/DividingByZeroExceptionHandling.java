package chapter13;

public class DividingByZeroExceptionHandling {

    public static void main(String[] args) {

        divideByZero();
    }

    public static void divideByZero() {

        try {
            int c = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero is not permitted");
        } finally {
            System.out.println("Division is fun");
        }

    }


}
