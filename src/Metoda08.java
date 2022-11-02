public class Metoda08 {
    public static void main(String[] args) {
        int ocenaMariusza = 5;
        int ocenaDariusza = 4;
        int sumaOcen1 = ocenaDariusza + ocenaMariusza;

        System.out.println("Suma ocen uczniów: " + sumaOcen1);

        int ocenaMalgosi = 5;
        int ocenaZosi = 4;
        int sumaOcen2 = ocenaMalgosi + ocenaZosi;

        System.out.println("Suma ocen uczniów: " + sumaOcen2);
    }
}


/* Ten sam przykład, tylko bez metody. Wykonamy oba obliczenia bez użycia metod.
 Teraz wyobraź sobie, że wczytujemy te oceny z pliku i jest ich 200 par. Dostajemy zadanie
 zmodyfikowania operacji, zamiast sumy ocen, manager prosi nas o pomnożenie obu ocen i wypisania
 wyniku do konsoli. Czyli musimy zmienić operację dodawania na operacje mnożenia. Dodatkowo
 zmienić musimy "Suma ocen uczniów" na "Wynik mnożenia ocen uczniów". Jeśli korzystamy z metody
 to zmieniamy w jednym miejscu w kodzie "Suma" na "Wynik mnożenia" i także w 1 miejscu w kodzie:
 int sumaOcen = ocenaUcznia 1 + ocena Ucznia 2 na
 int wynik MnozeniaOcen = ocenaUcznia1 * ocenaUcznia2
 A jeśli nie korzystamy z metod, tylko robimy to na piechotę to mamy aktualnie 200 zduplikowanych
 operacji, które musimy ręcznie modyfikować :). Czy widzisz już potencjał jaki kryje w sobie używanie metod

 */