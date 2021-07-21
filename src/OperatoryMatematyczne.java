//operatory matematyczne umozliwiaja wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber; //10
        int subtraction = firstNumber - secondNumber; //-2
        int multiplication = firstNumber * secondNumber;//24
        float division = thirdNumber / secondNumber; //0,66
        int mod = secondNumber % firstNumber; // 4 mieści się w 6 1,2

        System.out.println("Wynik dodawania " + addition); //+
        System.out.println("Odejmowanie " + subtraction); //+
        System.out.println("Mnożenie " + multiplication); // +
        System.out.println("Dzielenie " + division); //+
        System.out.println("Modulo " + mod); //+


    }
}