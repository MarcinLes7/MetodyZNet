public class Metoda06 {
    public static void main(String[] args) {
        int ocenaJanusza = 5;
        int ocenaMariusza = 4;

        dodajOcenyUczniow(ocenaMariusza, ocenaJanusza);
    }
    static void dodajOcenyUczniow(int ocenaUcznia1, int ocenaUcznia2) {
        int sumaOcen = ocenaUcznia1 + ocenaUcznia2;
        System.out.println("Suma ocen uczniow: " + sumaOcen);
    }
}


/* W tym przykładzie przekazujemy do metody 2 argumenty, są nimi 2 oceny uczniów Janusza i Mariusza.
 Metoda ma proste zadanie, czyli sumowanie obu ocen uczniów. Plus pozwoliłem sobie wypisać sume ocen do konsoli.*/