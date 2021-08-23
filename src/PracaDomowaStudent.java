public class PracaDomowaStudent {
    public static void main(String[] args) {
        Student AdamBodnar = new Student();
        AdamBodnar.imie ="Adam";
        AdamBodnar.nazwisko ="Bodnar";
        AdamBodnar.nick ="Boniek";
        AdamBodnar.email ="bolo@ada.pl";
        AdamBodnar.numerIndeksu =121234;

        Student Wojtek = new Student();
        Wojtek.imie ="Wojtek";
        Wojtek.nazwisko ="Wojciaszek";
        Wojtek.nick ="W0jtek";
        Wojtek.email ="wolo@tek.pl";
        Wojtek.numerIndeksu =121235;

        Student Krzysztof = new Student();
        Krzysztof.imie ="Krzysztof";
        Krzysztof.nazwisko ="Krawczyk";
        Krzysztof.nick ="Krawiec";
        Krzysztof.email ="krako@tatuaz.pl";
        Krzysztof.numerIndeksu =121236;

        Student[] students = new Student[3];
        students[0] =AdamBodnar;
        students[1] = Wojtek;
        students[2] = Krzysztof;

        for (int i=0; i<students.length; i++){
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();
        }
    }


}


                //public String imie;
//    public String nazwisko;
//    public String nick;
//    public String email;
//    public int numerIndeksu;