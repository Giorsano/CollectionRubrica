import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Contatto contatto1 = new Contatto("Giordano", "Orlacchio", "34895662358");
        Contatto contatto2 = new Contatto("Patrizio", "Joestar", "52236658944");
        Contatto contatto3 = new Contatto("Sofia", "Caruso", "556698995623");
        Contatto contatto4 = new Contatto("Pablo", "Escobar", "3669855421");
        Rubrica rubrica = new Rubrica(new HashMap<String, String>());


        System.out.println(contatto1);
        System.out.println(" ");
        System.out.println(contatto2);
        System.out.println(" ");
        System.out.println(contatto3);
        System.out.println(" ");
        System.out.println(contatto4);
        System.out.println(" ");
        System.out.println(" ");
        rubrica.aggiungi(contatto1);
        System.out.println(rubrica);
        rubrica.aggiungi(contatto2);
        rubrica.aggiungi(contatto3);
        System.out.println(rubrica);
        rubrica.rimuovi(contatto1);
        System.out.println(rubrica);
        rubrica.rimuovi(contatto2);
        System.out.println(rubrica);
    }
}
