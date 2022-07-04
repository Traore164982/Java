package affiche;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;
import service.IServices;
import service.Services;

public class Menu {

    protected int choice;
    protected final int TAILLE = 10;
    Scanner clavier = new Scanner(System.in);

    protected int indexPavillon;
    protected int indexChambre;
    
    protected Pavillon[] tabPavillon = new Pavillon[TAILLE];
    protected Chambre[] tabChambre = new Chambre[TAILLE];
    private Etudiant[] tabEtudiant = new Etudiant[TAILLE];

    protected Chambre[] c = new Chambre[TAILLE];
    protected Pavillon[] t = new Pavillon[TAILLE];
    protected Etudiant[] e = new Etudiant[TAILLE];

    private int id;
    private int indexEtudiant;


    
    public void menus(){

        System.out.println("Bienvenue dans le Menu Principal.....");
        System.out.println("1-     Gestion Pavillon");
        System.out.println("2-     Gestion Chambre");
        System.out.println("3-     Gestion Etudiant");
        System.out.println("4-             Quitter");
        choix();
    }

    public void menusPavillon(){

        System.out.println("Bienvenue dans le Menu de Gestion Pavillon.....");
        System.out.println("1-          Ajout");
        System.out.println("2-          Liste");
        System.out.println("3-          Supprimer");
        System.out.println("4-          Quitter");
    }
    public void menusEtudiant(){

        System.out.println("Bienvenue dans le Menu de Gestion Etudiant.....");
        System.out.println("1-          Ajout");
        System.out.println("2-          Liste");
        System.out.println("3-          Supprimer");
        System.out.println("4-          Quitter");
    }
    public void menusChambre(){

        System.out.println("Bienvenue dans le Menu de Gestion Chambre.....");
        System.out.println("1-          Ajout");
        System.out.println("2-          Liste");
        System.out.println("3-          Supprimer");
        System.out.println("4-          Quitter");
    }
    
    public void choix(){
        IServices services = new Services();
        choice = clavier.nextInt(); 
        switch (choice) {
            case 1:
                menusPavillon();
                pavillon();
                break;
            case 2:
                menusChambre();
                chambre();
                break;
            case 3:
                menusEtudiant();
                etudiant();
                break;
        
            default: menus();
                break;
        }
    }

    public void pavillon(){
        IServices services = new Services();
        choice = clavier.nextInt(); 
        switch (choice) {
            case 1:
                System.out.println("Saisir l'id");
                int id = clavier.nextInt();
                System.out.println("Saisir le numero du Pavillon");
                int numero = clavier.nextInt();
                System.out.println("Saisir le nombre d'etages");
                int etages = clavier.nextInt();
                Pavillon p = new Pavillon(id,numero,etages);
                t=services.addPavillon(p,tabPavillon,indexPavillon);
                menusPavillon();
                pavillon();
                break;
            case 2:
                services.listePavillon(t,indexPavillon);
                menusPavillon();
                pavillon();
            break;
            case 3:
            System.out.println("Veuillez Saisir l'id de l'Objet à supprimer");
            id = clavier.nextInt();            
            services.removePavillon(t,id);               
            default: menus();
                break;
        }
    }
    public void chambre(){
        IServices services = new Services();
        choice = clavier.nextInt(); 
        switch (choice) {
            case 1:
                System.out.println("Saisir l'id");
                int id = clavier.nextInt();
                System.out.println("Saisir le numero de la chambre");
                int numero = clavier.nextInt();
                System.out.println("Saisir le numero de l'Etage");
                int etages = clavier.nextInt();
                Chambre chambre = new Chambre(id,numero,etages);
                c = services.addChambre(chambre,tabChambre,indexChambre);
                menusChambre();
                chambre();
                break;
            case 2:
                services.listeChambre(c,indexChambre);
                menusChambre();
                chambre();
            break;
            case 3:
            System.out.println("Veuillez Saisir l'id de la chambre à supprimer");
            id = clavier.nextInt();            
            services.removeChambre(c, id);               
            default: menus();
                break;
        }
    }

    public void etudiant(){
        IServices services = new Services();
        choice = clavier.nextInt(); 
        switch (choice) {
            case 1:
                System.out.println("Saisir l'id");
                int id = clavier.nextInt();
                System.out.println("Saisir le nom");
                String nom = clavier.nextLine();
                System.out.println("Saisir le prenom");
                String prenom = clavier.nextLine();
                System.out.println("Saisir le matricule");
                String mat = clavier.nextLine();
                System.out.println("Saisir l'email");
                String email = clavier.nextLine();
                System.out.println("Saisir le mot de passe");
                String password = clavier.nextLine();;
                System.out.println("Saisir la date de naissance");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String str = "06/11/2019";
                try {
                    Date date = (Date) sdf.parse(str);
                    System.out.println(date.toString());
                    str = date.toString();
                        } catch (ParseException e) {
                            e.printStackTrace();
                    }
                System.out.println("Saisir le numéro de téléphone");
                String tel = clavier.nextLine();

                Etudiant etudiant = new Etudiant(mat,str,tel,nom,prenom,email,password);
                e = services.addEtudiant(etudiant,tabEtudiant,indexEtudiant);
                menusEtudiant();
                etudiant();
                break;
            case 2:
                services.listeEtudiant(tabEtudiant, indexEtudiant);
                menusPavillon();
                pavillon();
            break;
            case 3:
            System.out.println("Veuillez Saisir l'id de l'Objet à supprimer");
            id = clavier.nextInt();            
            services.removePavillon(t,id);               
            default: menus();
                break;
        }
    }

}
