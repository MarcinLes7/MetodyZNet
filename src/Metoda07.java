public class Metoda07 {
    public static void main(String[] args) {
        int ocenaJanusza = 5;
        int ocenaMariusza = 4;
        int ocenaDariusza = 4;
        dodajOcenyUczniow(ocenaMariusza, ocenaJanusza, ocenaDariusza);

        int ocenaMalgosi = 5;
        int ocenaJasia = 5;
        int ocenaZosi = 4;
        dodajOcenyUczniow(ocenaMalgosi, ocenaJasia, ocenaZosi);
    }

    static void dodajOcenyUczniow(int ocenaUcznia1, int ocenaUcznia2, int ocenaUcznia3) {
        int sumaOcen = ocenaUcznia1 + ocenaUcznia2 + ocenaUcznia3;
        System.out.println("Suma ocen uczniów: " + sumaOcen);

    }
}

/* Ten przykład pokazuje nam, że metodę możemy użyć więcej niż 1 raz. I nie musimy duplikować logiki dodawania.
 To tylko bardzo prosty przykład obrazujący jak fajne i poręczne mogą być metody.*/