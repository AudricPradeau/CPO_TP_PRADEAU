/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_pradeau_version_console;

import java.util.Scanner;


/**
 *
 * @author Utilisateur
 */
public class Partie {
   private GrilleDeCellules grille;
    private int nbCoups;

    /**
     * Constructeur de la classe Partie. Crée une nouvelle instance de la grille de cellules lumineuses
     * avec le nombre de lignes et de colonnes spécifié, puis initialise le compteur de coups à zéro.
     *
     * @param nbLignes    Le nombre de lignes de la grille.
     * @param nbColonnes  Le nombre de colonnes de la grille.
     */
    public Partie(int nbLignes, int nbColonnes) {
        grille = new GrilleDeCellules(nbLignes, nbColonnes);
        nbCoups = 0;
    }

    /**
     * Initialise la partie en s'assurant que la grille de jeu est bien mélangée.
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(50); // Mélange la grille 50 fois (ajustez le nombre de tours au besoin)
    }

    /**
     * Le c?ur de la classe Partie. Permet de jouer au jeu LightOff de manière interactive.
     * Affiche l'état initial de la grille, puis entre dans une boucle de jeu qui continue tant que
     * toutes les cellules ne sont pas éteintes.
     */
    public void lancerPartie() {
        initialiserPartie();
        afficherGrille();

        Scanner scanner = new Scanner(System.in);

        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Entrez un coup (ligne, colonne, diagonale ou quitter) : ");
            String coup = scanner.nextLine();

            if (coup.equals("ligne")) {
                System.out.print("Entrez le numéro de la ligne : ");
                int ligne = scanner.nextInt();
                grille.activerLigneDeCellules(ligne - 1); // Soustrayez 1 pour correspondre à l'index 0-based
            } else if (coup.equals("colonne")) {
                System.out.print("Entrez le numéro de la colonne : ");
                int colonne = scanner.nextInt();
                grille.activerColonneDeCellules(colonne - 1); // Soustrayez 1 pour correspondre à l'index 0-based
            } else if (coup.equals("diagonale")) {
                grille.activerDiagonaleDescendante();
            } else if (coup.equals("quitter")) {
                System.out.println("Partie interrompue.");
                break;
            } else {
                System.out.println("Commande invalide.");
            }

            nbCoups++;
            afficherGrille();
            scanner.nextLine(); // Pour consommer la nouvelle ligne après la saisie du numéro.
        }

        System.out.println("Bravo ! Vous avez gagné en " + nbCoups + " coups.");
    }

    /**
     * Affiche l'état actuel de la grille.
     */
    public void afficherGrille() {
        System.out.println(grille);
    }

    public static void main(String[] args) {
        Partie partie = new Partie(5, 5);
        partie.lancerPartie();
    }
    
}
    
    

