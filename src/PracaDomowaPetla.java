public class PracaDomowaPetla {
    public static void main(String[] args) {

        /*for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Jestem podzielna przez 3 :" + i);
            }
        }*/
        int[] numbers = new int[] {1,3,5,7,0};

        for (int i=0; i<(numbers.length/2); i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]= temp;
            System.out.println("Iteracja numer "+ i);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

    }
}