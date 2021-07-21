import java.util.Scanner;

public class OperatoryPorownania {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Podaj proszę pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj proszę drugą liczbę");
        int secondNumber = scanner.nextInt();

        boolean result = secondNumber > firstNumber;

        System.out.println("b > a : " + (result));
        System.out.println("a = b : " + (firstNumber == secondNumber));
        System.out.println("a =/= b : " + (firstNumber != secondNumber));
        System.out.println("a > b : " + (firstNumber > secondNumber));
        System.out.println("a < b : " + (firstNumber < secondNumber));
        System.out.println("a >= b : " + (firstNumber >= secondNumber));
        System.out.println("a <= b : " + (firstNumber <= secondNumber));
    }
}
