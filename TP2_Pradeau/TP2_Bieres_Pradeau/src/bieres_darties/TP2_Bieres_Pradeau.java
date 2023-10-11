package bieres_darties;


import bieres_darties.BouteilleBiere;

/*
 TP2 Partie 1
Pradeau Audric
11/10
package tp2_bieres_pradeau;

/**
 *
 * @author Utilisateur
 */
public class TP2_Bieres_Pradeau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
    uneBiere.ouverte=true;
    uneBiere.decapsuler();
    System.out.println(uneBiere) ;
    
    
    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
    System.out.println(autreBiere) ;
    
    BouteilleBiere encoreBiere= new BouteilleBiere ("Cherry Chouffe", 8.0, "Chouffe");
    System.out.println(encoreBiere) ;
    
    BouteilleBiere etBiere= new BouteilleBiere ("8.6", 8.6, "Swinkels");
    etBiere.ouverte=true;
    etBiere.decapsuler();
    System.out.println(etBiere) ;
    
    BouteilleBiere etUneBiere= new BouteilleBiere ("heineken blonde", 4, "heineken");
    System.out.println(etUneBiere) ;
    
    }
}
  

