import java.util.Scanner;

public class PracaDomowaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile masz lat :");
        int age = scanner.nextInt();
        if (age>120) {
            System.out.println("Chyba za dużo");
        }else if (age<1){
            System.out.println("Podaj wartość właściwą");
        }else if (age >= 18){
            System.out.println("Jesteś pełnoletni, możesz wejść");
        }else{
            System.out.println("Nie masz 18 lat, nie możesz wejść");
        }
    }
}
