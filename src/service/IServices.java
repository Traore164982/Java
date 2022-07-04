package service;

import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public interface IServices {
    
    public Pavillon[] addPavillon(Pavillon pavillon, Pavillon tabPavillon[], int indexPavillon);

    public void removePavillon(Pavillon tabPavillon[],int id);

    public void listePavillon(Pavillon tabPavillon[], int indexPavillon);

    public Chambre[] addChambre(Chambre chambre,Chambre tabChambre[], int indexChAmbre);

    public void removeChambre(Chambre tabChambre[],int id);

    public void listeChambre(Chambre tabChambre[],int indexChAmbre);

    public Etudiant[] addEtudiant(Etudiant etudiant,Etudiant tabEtudiant[], int indexEtudiant);

    public void removeEtudiant(Etudiant tabEtudiant[],int id);

    public void listeEtudiant(Etudiant tabEtudiant[],int indexEtudiant);
}
