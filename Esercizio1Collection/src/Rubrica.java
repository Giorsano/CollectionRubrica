import java.util.HashMap;

public class Rubrica {

    private HashMap<String, String> rubrica = new HashMap<>();
    Contatto contatto;


    Rubrica(HashMap<String, String> rubrica){
        this.rubrica = rubrica;
        this.contatto = contatto;
    }

    public HashMap<String, String> getRubrica() {
        return rubrica;
    }

    public Contatto getContatto() {
        return contatto;
    }

    public void aggiungi(Contatto contatto){
        rubrica.put(contatto.getNome() + contatto.getCognome(), contatto.getNumTelefono());
    }

    public void rimuovi(Contatto contatto){
        rubrica.remove(contatto.getNome() + contatto.getCognome(), contatto.getNumTelefono());
    }

    public String cerca(String x){
        rubrica.values();
        return x;
    }

    public String toString(){
        String y = "La rubrica aggiornata è: " + rubrica.toString();
        return y;
    }


}
