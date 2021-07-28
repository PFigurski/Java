import java.util.Scanner;

public class PracaDomowaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile masz lat :");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Jesteś pełnoletni, możesz wejść");
        }else if (age<1){
            System.out.println("Podaj wartość dodatnią");
        }else{
            System.out.println("Nie masz 18 lat, nie możesz wejść");
        }
    }
}
