
import java.util.Scanner;

/*
  * TP1 Exercice 1
   Pradeau Audric TDA
  26/09/23
package tp1_manipnombresint_pradeau;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class TP1_manipNombresInt_PRADEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir deux entiers
        System.out.print("Veuillez saisir le premier entier : ");
        int premierEntier = scanner.nextInt();

        System.out.print("Veuillez saisir le second entier : ");
        int secondEntier = scanner.nextInt();

        // Affiche les entiers saisis
        System.out.println("Vous avez saisi les entiers suivants :");
        System.out.println("Premier entier : " + premierEntier);
        System.out.println("Second entier : " + secondEntier);

        // Calculs et affichage des résultats
        int somme = premierEntier + secondEntier;
        int difference = premierEntier - secondEntier;
        int produit = premierEntier * secondEntier;
        int quotient = premierEntier / secondEntier;
        int reste = premierEntier % secondEntier;

        System.out.println("Somme : " + somme);
        System.out.println("Difference : " + difference);
        System.out.println("Produit : " + produit);
        System.out.println("Quotient entier : " + quotient);
        System.out.println("Reste de la division : " + reste);
    }
}
   
    
    

