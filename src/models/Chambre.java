package models;

public class Chambre {
    
    private int id;
    private int numeroEtage;
    private int numeroChambre;
    private Pavillon pavillon;

    public Chambre(int id, int numeroEtage, int numeroChambre) {
        this.id = id;
        this.numeroEtage = numeroEtage;
        this.numeroChambre = numeroChambre;
    }

    public Pavillon getPavillon() {
        return pavillon;
    }
    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumeroChambre() {
        return numeroChambre;
    }
    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }
    public int getNumeroEtage() {
        return numeroEtage;
    }
    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }
}
