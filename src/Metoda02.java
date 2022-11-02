public class Metoda02 {
    public static void main(String[] args) {
        // wywolanie metody - czyli zawolanie tego co zakodowaliśmy
        wypiszHejka();
    }

    // definicja metody - czyli zakodowanie kawałka kodu i nazwanie go wypiszHejka()
    // abyśmy mogli go później tej kawałek kodu zawołać z maina
    // metoda powinna nazywac się tak, że mówi nam co robi

    static void wypiszHejka() { // void to typ, który będziemy zwracać
        System.out.println("Hejka");
    }

}

    /* W tym przykładzie widzimy, że mamy nową metodę o nazwie wypiszHejka().
     Te 2 programy nie różnią się niczym pod względem funkcjonalnym, czyli działają tak samo
     - wypisują "Hejka" do konsoli. I teraz po co to w ogóle robić skoro nie ma różnicy w tym co program robi?
     Metodki są po to, aby projektować naszą aplikację tak aby kod, był re-używalny
      i aby programista nie gubił się w swoim kodzie :). Serio, serio to możliwe.*/