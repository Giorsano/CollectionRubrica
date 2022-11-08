public class Contatto {
    private String nome;
    private String cognome;
    private String numTelefono;

    Contatto(String nome, String cognome, String numTelefono){
        this.nome = nome;
        this.cognome = cognome;
        this.numTelefono = numTelefono;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String toString(){
        String s = "il contatto che hai selezionato è: " + getNome() + " " + getCognome() + " " + getNumTelefono();
        return s;
    }
}
