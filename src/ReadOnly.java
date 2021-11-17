public class ReadOnly {

    private String name = "Bartek";
//gettery to metody które służa do pobierania wartości z pól prywatnych
    public String getName() {
        return name + " jest ok";
    }

    //settery metody które umożliwiają nam  ustawienie wartości pola prywatnego
    public void setName(String name) {
        this.name = name;
    }

}
