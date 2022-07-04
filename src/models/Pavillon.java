package models;

public class Pavillon {
    private int id;
    private int numero;
    private int nbreEtage;



 public Pavillon(int id, int numero, int nbreEtage) {
        this.id = id;
        this.numero = numero;
        this.nbreEtage = nbreEtage;
    }
public Pavillon() {

}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
 public int getNbreEtage() {
    return nbreEtage;
}
public void setNbreEtage(int nbreEtage) {
    this.nbreEtage = nbreEtage;
}
public int getNumero() {
    return numero;
}
public void setNumero(int numero) {
    this.numero = numero;
}
@Override
public String toString() {
    return "Pavillon [id=" + id + ", nbreEtage=" + nbreEtage + ", numero=" + numero + "]";
}    

}
