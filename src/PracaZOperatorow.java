import java.util.Scanner;

public class PracaZOperatorow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Teraz podaj drugą liczbę nie może być to liczba równa zero");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int addition = calculator.add(firstNumber, secondNumber);
        int substraction = calculator.sub(firstNumber, secondNumber);
        int multiplication = calculator.multi(firstNumber, secondNumber);
        int division = calculator.div(firstNumber, secondNumber);
        int mod = calculator.mod(firstNumber, secondNumber);

        System.out.println("Wynik dodawania tych liczb to: " + addition);
        System.out.println("Wynik odejmowania tych liczb to: " + substraction);
        System.out.println("Wynik mnożenia tych liczb to: " + multiplication);
        System.out.println("Wynik dzielenia tych liczb to: " + division);
        System.out.println("Modulo tych liczb to: " + mod);
    }
}
