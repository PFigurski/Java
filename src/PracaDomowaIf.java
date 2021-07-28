import java.util.Scanner;

public class PracaDomowaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile masz lat :");
        int wiek = scanner.nextInt();
        if (wiek >= 18){
            System.out.println("Jesteś pełnoletni, możesz wejść");
        }else {
            System.out.println("Nie masz 18 lat, nie możesz wejść");
        }
    }
}
