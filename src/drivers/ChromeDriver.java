package drivers;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę Chrome");
    }

    @Override
    public void findElementBY() {
        System.out.println("Znajduje element w przeglądarce Chrome");
    }
}
