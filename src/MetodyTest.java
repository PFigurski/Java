public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
     /*  int result = metody.pobierzWynik();
       int result2 = result * 2;
        System.out.println("Rezultat po mnożeniu to: " + result2);*/
       /* metody.policzParam(2);
        metody.policzParam(100);
        metody.policzParam(23);*/

        int result = metody.add(2,3);
        System.out.println(metody.add(2,6));
        System.out.println(result);

    }
}
