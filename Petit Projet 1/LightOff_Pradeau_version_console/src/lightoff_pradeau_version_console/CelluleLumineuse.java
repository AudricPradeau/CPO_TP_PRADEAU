/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_pradeau_version_console;

/**
 *
 * @author Utilisateur
 */
public class CelluleLumineuse {
    private boolean etat;

    /**
     * Constructeur par défaut de la classe CelluleLumineuse. Initialise la cellule en état "éteinte".
     */
    public CelluleLumineuse() {
        etat = false; // Initialisation de la cellule en état éteint
    }

    /**
     * Active la cellule lumineuse en inversant son état actuel.
     * Si la cellule est allumée, elle devient éteinte, et si elle est éteinte, elle s'allume.
     */
    public void activerCellule() {
        etat = !etat; // Inversion de l'état de la cellule
    }

    /**
     * Éteint la cellule en la mettant dans l'état "éteinte" (false).
     * Si la cellule était déjà éteinte, cette méthode n'a aucun effet.
     */
    public void eteindreCellule() {
        etat = false;
    }

    /**
     * Vérifie si la cellule est actuellement éteinte.
     *
     * @return true si la cellule est éteinte, false si elle est allumée.
     */
    public boolean estEteint() {
        return !etat;
    }

    /**
     * Renvoie l'état actuel de la cellule.
     *
     * @return true si la cellule est allumée, false si elle est éteinte.
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * Redéfinition de la méthode toString pour afficher l'état de la cellule de manière lisible.
     * Si la cellule est allumée, elle affiche "X", et si la cellule est éteinte, elle affiche "O".
     *
     * @return La représentation textuelle de l'état de la cellule ("X" pour allumée, "O" pour éteinte).
     */
    @Override
    public String toString() {
        return etat ? "X" : "O";
    }
}