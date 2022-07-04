package models;

public class Personne {
    public int id;
    public String prenom;
    public String nom;
    public String email;
    public String password;
    Personne(String prenom, String nom, String email, String password) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
