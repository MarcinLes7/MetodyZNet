public class Metoda05 {
    public static void main(String[] args) {
        int wiekUzytkownika = 25;
        String imieUzytkownika = "Marcin";

        wypiszDaneUzytkownika(wiekUzytkownika, imieUzytkownika);
    }
    static void wypiszDaneUzytkownika(int wiekUzytkownika, String imieUzytkownika) {
        System.out.println("Twoje imię to " + imieUzytkownika);
        System.out.println("Masz już lat " + wiekUzytkownika);
    }
}


/* W tym przykładzie przekazujemy 2 argumenty do metody.
 Ten przykład jest bardzo podobny do porzedniego, tylko zamiast 1 parametru, nasza metoda przyjmuje 2 parametry.
 Wcześniej był to tylko int, teraz jest to int i String.

 Warto też wspomnieć, że metody powinno nazywać się jako rzeczownik - czyli co robi.

 */