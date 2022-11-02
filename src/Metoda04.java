public class Metoda04 {
    public static void main(String[] args) {
        int mojaUlubionaLiczba = 7;
        wypiszMojaUlubionaLiczbe(mojaUlubionaLiczba);
    }
    static void wypiszMojaUlubionaLiczbe(int mojaUlubionaLiczba) {
        System.out.println("Twoja ulubiona liczba to: " + mojaUlubionaLiczba);
    }

}

/* W tym przykładzie zaczyna się dziać nieco więcej.
  Po raz pierwszy przyjmujemy parametr typu int o nazwie mojaUlubionaLiczba.
  Parametry do metody przekazujemy pomiędzy (), czyli (int mojaUlubionaLiczba)
  a we wcześniejszych przykładach nie przekazywaliśmy nic do metody, dlatego
  nasze nazwiasy były puste ().
  I teraz w metodzie możemy korzystać z naszej zmiennej, którą sobie przjeliśmy.
  Możemy ją wypisać, tak jak to zrobiliśmy w naszym przykładzie.
  */
