// && - operator "i", || - operator "lub", !xyz - operator "negacja"

public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = 2>1;
        boolean secondValue = 2<1;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && ->true wtedy gdy wyrażenia składowe są równe true
        System.out.println(firstValue && secondValue);//false
        System.out.println(firstValue && fourthValue);//true
        System.out.println(secondValue && thirdValue);//false

        // || lub -> true gdy jedno wyrażenie składowe jest == true
        System.out.println(firstValue || secondValue);//true
        System.out.println(firstValue || fourthValue);//true
        System.out.println(secondValue || thirdValue); //false

        // ! negacja zwraca wartość przeciwną do wyrażenia przed którym się znajduje
        System.out.println(!firstValue);//false
        System.out.println(!thirdValue);//true
        System.out.println(!(firstValue&&secondValue));//true

    }
}
