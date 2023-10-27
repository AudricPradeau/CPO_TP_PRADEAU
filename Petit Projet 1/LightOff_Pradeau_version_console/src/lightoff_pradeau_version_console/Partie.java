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
     * Constructeur de la classe Partie. Cr�e une nouvelle instance de la grille de cellules lumineuses
     * avec le nombre de lignes et de colonnes sp�cifi�, puis initialise le compteur de coups � z�ro.
     *
     * @param nbLignes    Le nombre de lignes de la grille.
     * @param nbColonnes  Le nombre de colonnes de la grille.
     */
    public Partie() {
        grille = new GrilleDeCellules(4, 4); // Par d�faut, grille de 4x4 pour le niveau normal
        nbCoups = 0;
    }

    

    /**
     * Le c?ur de la classe Partie. Permet de jouer au jeu LightOff de mani�re interactive.
     * Affiche l'�tat initial de la grille, puis entre dans une boucle de jeu qui continue tant que
     * toutes les cellules ne sont pas �teintes.
     */
    public void lancerPartie() {
        initialiserPartie();
        afficherGrille();

        Scanner scanner = new Scanner(System.in);

        while (!grille.cellulesToutesEteintes() && !grille.cellulesToutesAllumees()) {
        System.out.println("Entrez un coup (ligne, colonne, diagonale ou quitter) : ");
        String coup = scanner.nextLine();

        if (coup.equals("ligne")) {
            System.out.print("Entrez le num�ro de la ligne : ");
            int ligne = scanner.nextInt();
            grille.activerLigneDeCellules(ligne - 1); // Soustrayez 1 pour correspondre � l'index 0-based
        } else if (coup.equals("colonne")) {
            System.out.print("Entrez le num�ro de la colonne : ");
            int colonne = scanner.nextInt();
            grille.activerColonneDeCellules(colonne - 1); // Soustrayez 1 pour correspondre � l'index 0-based
        } else if (coup.equals("diagonale")) {
            grille.activerDiagonaleDescendante();
        } else if (coup.equals("quitter")) {
            System.out.println("Partie interrompue. Revenez nous voir bient�t !");
            break;
        } else {
            System.out.println("Commande invalide.");
        }

        nbCoups++;
        afficherGrille();
        scanner.nextLine();
    }

    if (grille.cellulesToutesEteintes()) {
        System.out.println("Bravo ! Vous avez gagn� en " + nbCoups + " coups.");
    } else if (grille.cellulesToutesAllumees()) {
        System.out.println("Bravo ! Vous avez gagn� en " + nbCoups + " coups.");
    }
}

    /**
     * Affiche l'�tat actuel de la grille.
     */
    public void afficherGrille() {
        System.out.println(grille);
    }

     public void choisirNiveau() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un niveau de difficult� :");
        System.out.println("1. Facile (3x3)");
        System.out.println("2. Normal (5x5)");
        System.out.println("3. Difficile (7x7)");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                grille = new GrilleDeCellules(3, 3);
                break;
            case 2:
                grille = new GrilleDeCellules(5, 5);
                break;
            case 3:
                grille = new GrilleDeCellules(7, 7);
                break;
            default:
                System.out.println("Niveau de difficult� non valide. Niveau normal (4x4) choisi par d�faut.");
                break;
        }
    }

    public void initialiserPartie() {
        choisirNiveau();
        grille.melangerMatriceAleatoirement(10); // M�langer la grille
    }}

  
    
    

