/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_pradeau_version_console;

import java.util.Random;



/**
 *
 * @author Utilisateur
 */
public class GrilleDeCellules {
    public CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    /**
     * Constructeur de la classe GrilleDeCellules.
     *
     * @param nbLignes    Le nombre de lignes de la grille.
     * @param nbColonnes  Le nombre de colonnes de la grille.
     */
    public GrilleDeCellules(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        // Initialisation de la matrice de cellules
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     * Active toutes les cellules d'une ligne spécifique de la grille.
     *
     * @param idLigne  L'indice de la ligne à activer.
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    /**
     * Active toutes les cellules d'une colonne spécifique de la grille.
     *
     * @param idColonne  L'indice de la colonne à activer.
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    /**
     * Active la diagonale descendante de la grille en allumant les cellules correspondantes.
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     * Vérifie si toutes les cellules de la grille sont allumées.
     *
     * @return true si toutes les cellules sont allumées, sinon false.
     */
    public boolean cellulesToutesAllumees() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Vérifie si toutes les cellules de la grille sont éteintes.
     *
     * @return true si toutes les cellules sont éteintes, sinon false.
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Mélange la grille de manière aléatoire en effectuant un certain nombre de tours.
     *
     * @param nbTours  Le nombre de tours de mélange à effectuer.
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        Random random = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
            int choix = random.nextInt(3);

            if (choix == 0) {
                int ligne = random.nextInt(nbLignes);
                activerLigneDeCellules(ligne);
            } else if (choix == 1) {
                int colonne = random.nextInt(nbColonnes);
                activerColonneDeCellules(colonne);
            } else {
                activerDiagonaleDescendante();
            }
        }
    }

    /**
     * Redéfinition de la méthode toString pour afficher l'état de la grille de manière stylée.
     *
     * @return La représentation textuelle de l'état de la grille.
     */
    @Override
    public String toString() {
        StringBuilder grilleStr = new StringBuilder();

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                grilleStr.append(matriceCellules[i][j]);
                grilleStr.append(" ");
            }
            grilleStr.append("\n");
        }

        return grilleStr.toString();
    }

    public void eteindreToutesLesCellules() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}