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
    private String eliot ;

    // Constructeurs
    public Affectation() {
    }
    public Affectation(String panneesemaine, String ptempspasse,String peliot) {
    this.panneesemaine = pAnneeSemaine; 
    this.ptempspasse = pTempsPasse;
    this.peliot = Peliot;
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
