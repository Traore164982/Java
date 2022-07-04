package service;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public class Services implements IServices{
    
    private final int TAILLE = 10;
    private Pavillon[] tabPavillon = new Pavillon[TAILLE];
    private Pavillon[] tabPavillonS = new Pavillon[TAILLE];
    private Chambre[] tabChambre = new Chambre[TAILLE];
    private Etudiant[] tabEtudiant = new Etudiant[TAILLE];

    private int indexChambre;
    private int indexEtudiant;
    private int indexPavillon;

    @Override
    public Pavillon[] addPavillon(Pavillon pavillon, Pavillon[] tabPavillon, int indexPavillon) {
        // TODO
        if(indexPavillon < TAILLE){
            tabPavillon[indexPavillon] = pavillon;
            indexPavillon++;
        }
        return tabPavillon;
    }

    @Override
    public void removePavillon(Pavillon[] tabPavillon, int id) {
        // TODO
        for (int i = 0; i < tabPavillon.length; i++) {
            if(i==id){
                tabPavillon[i] = null;
            }
        }
    }

    @Override
    public void listePavillon(Pavillon[] tabPavillon, int indexPavillon) {
        // TODO
        for (Pavillon pavillon : tabPavillon) {
            if (pavillon!=null) {
                System.out.println(pavillon);
            }
        }
    }

    @Override
    public Chambre[] addChambre(Chambre chambre, Chambre[] tabChambre, int indexChAmbre) {
        // TODO
        if(indexChambre < TAILLE){
            tabChambre[indexChambre] = chambre;
            indexChambre++;
        }
        return tabChambre;
    }

    @Override
    public void removeChambre(Chambre[] tabChambre, int id) {
        // TODO
        for (int i = 0; i < tabChambre.length; i++) {
            if(i==id){
                tabChambre[i] = null;
            }
        }
    }

    @Override
    public void listeChambre(Chambre[] tabChambre, int indexChAmbre) {
        // TODO
        for (Chambre chambre : tabChambre) {
            if (chambre!=null) {
                System.out.println(chambre);
            }
        }
    }

    @Override
    public Etudiant[] addEtudiant(Etudiant etudiant, Etudiant[] tabEtudiant, int indexEtudiant) {
        // TODO
        if(indexEtudiant < TAILLE){
            tabEtudiant[indexEtudiant] = etudiant;
            indexEtudiant++;
        }
        return tabEtudiant;
    }

    @Override
    public void removeEtudiant(Etudiant[] tabEtudiant, int id) {
        // TODO
    }

    @Override
    public void listeEtudiant(Etudiant[] tabEtudiant, int indexEtudiant) {
        // TODO
    }
}