/**
* date du programme
* 17/01/2023
* objet du programme
* Classe metier Salarie
* @author Janek
*/

public class Affectation {

    // déclaration des propriétés
    private String anneesemaine ;
    private String tempspasse ;
  

    // Constructeurs
    public Affectation() {
    }
    public Affectation(String panneesemaine, String ptempspasse) {
    this.anneesemaine = pAnneeSemaine; 
    this.ptempspasse = pTempsPasse;
    
    }

    // Accesseurs = getters
    public String getAnneeSemaine() {
    return anneesemaine;
    }

    public String getRempsPasse() {
    return tempspasse;
    }


    // Modificateurs = setters
    public void setAnneeSemaine(String pAnneeSemaine) {
    this.anneesemaine = pAnneeSemaine;
    }

    public void settempspasse(String pTempsPasse) {
    this.tempspasse = pTempsPasse;
    }


   
}
