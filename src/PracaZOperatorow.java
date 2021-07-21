import java.util.Scanner;

public class PracaZOperatorow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Teraz podaj drugą liczbę nie może być to liczba równa zero");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber+secondNumber;
        int substraction = firstNumber-secondNumber;
        int multiplication = firstNumber*secondNumber;
        int division = firstNumber/secondNumber;
        int mod = secondNumber % firstNumber;

        System.out.println("Wynik dodawania tych liczb to: " + addition);
        System.out.println("Wynik odejmowania tych liczb to: " + substraction);
        System.out.println("Wynik mnożenia tych liczb to: " + multiplication);
        System.out.println("Wynik dzielenia tych liczb to: " + division);
        System.out.println("Modulo tych liczb to: " + mod);
    }
}
