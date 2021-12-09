package drivers;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę Firefox");
    }

    @Override
    public void findElementBY() {
        System.out.println("Znajduje element w przeglądarce Firefox");

    }
}
