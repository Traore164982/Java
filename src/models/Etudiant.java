package models;
import java.util.Date;

public class Etudiant extends Personne {
    public String matricule;
    public String dateNaiss;
    public String tel;
    private Chambre chambre;

    public Chambre getChambre() {
        return chambre;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Etudiant(String matricule, String dateNaiss, String tell, String nom, String prenom, String email, String password){
        super(nom,prenom,email,password);
        this.matricule = matricule;
        this.dateNaiss = dateNaiss;
        this.tel = tel;
    }

    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getDateNaiss() {
        return dateNaiss;
    }
    public void setDateNaiss(String dateNaiss){
        this.dateNaiss = dateNaiss;
    }
    
}
