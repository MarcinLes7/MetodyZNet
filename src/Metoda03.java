public class Metoda03 {
    public static void main(String[] args) {
        wypiszCosWiecejNizHejka();
    }

    static void wypiszCosWiecejNizHejka() {
        System.out.println("Hejka");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }
}

/* W tym przykładzie dodaliśmy pętle for i wypisanie liczb 0,1,2.
 W ten sposób możemy tworzyć kod w metodzie. Dodałem coś poza "Hejka", aby pokazać,
 że pisanie w naszej nowej metodzie niczym nie różni się od pisania kodu w metodzie main,
 tak jak przyzwyczailiśmy się do tej pory. Od dziś piszemy zawsze kod w metodach i wywołujemy
 nasze nowe metody z main-a. Ok? Tak jak pisałem wcześniej, zauwaj mi, a po kilku dniach
 zobaczysz prawdziwe korzyści z pisania w metodach. Poza tym prawdziwi programiści nie
 umieją pisać bez metod na tym opiera się programowanie, aby tworzyć kod, który jest
 bardzo czytelny i metody powinny być w miarę małe. Np metoda, która ma 100 lini kodu,
 jest na 99% zbyt długa i da się jej logikę rozbić na mniejsze metody. Metoda też powinna
 mieć dobrą nazwę, aby mówiła każdemu programiście co się w niej dzieje - dlatego
 też powinna być krótka i mieć jedną odpowiedzialność, wtedy bardzo łatwo nam będzie
 dać tej metodzie prostą nazwę
*/


