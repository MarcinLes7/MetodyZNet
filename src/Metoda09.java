public class Metoda09 {
    public static void main(String[] args) {
        dodajOcenyUczniow(5, 4);
        dodajOcenyUczniow(5, 5);

    }
    static void dodajOcenyUczniow(int OcenaUcznia1, int ocenaUcznia2) {
        int sumaOcen = OcenaUcznia1 + ocenaUcznia2;
        System.out.println("Suma ocen uczniów to; " + sumaOcen);
    }

}


/* W tym przykładzie nie tworzymy sobie zmiennych z imionami uczniów, tylko przekazujemy je od razu do metody.
   Tutaj już widać jak bardzo kod nam się uprościł, oczywiście to kwestia gustu i jak lepiej Ci się pisze i czyta kod.
   Na początku lepiej chyba wybrać sobie ścięzkę z nazywaniem bardzo dokładnie wszystkich zmiennych,
   dlatego, że idzie się dużo szybciej odnazleźć w swoim kodzie. Mniej błędów będzie się popełniać.*/