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
     * Constructeur par d�faut de la classe CelluleLumineuse. Initialise la cellule en �tat "�teinte".
     */
    public CelluleLumineuse() {
        etat = false; // Initialisation de la cellule en �tat �teint
    }

    /**
     * Active la cellule lumineuse en inversant son �tat actuel.
     * Si la cellule est allum�e, elle devient �teinte, et si elle est �teinte, elle s'allume.
     */
    public void activerCellule() {
        etat = !etat; // Inversion de l'�tat de la cellule
    }

    /**
     * �teint la cellule en la mettant dans l'�tat "�teinte" (false).
     * Si la cellule �tait d�j� �teinte, cette m�thode n'a aucun effet.
     */
    public void eteindreCellule() {
        etat = false;
    }

    /**
     * V�rifie si la cellule est actuellement �teinte.
     *
     * @return true si la cellule est �teinte, false si elle est allum�e.
     */
    public boolean estEteint() {
        return !etat;
    }

    /**
     * Renvoie l'�tat actuel de la cellule.
     *
     * @return true si la cellule est allum�e, false si elle est �teinte.
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * Red�finition de la m�thode toString pour afficher l'�tat de la cellule de mani�re lisible.
     * Si la cellule est allum�e, elle affiche "X", et si la cellule est �teinte, elle affiche "O".
     *
     * @return La repr�sentation textuelle de l'�tat de la cellule ("X" pour allum�e, "O" pour �teinte).
     */
    @Override
    public String toString() {
        return etat ? "X" : "O";
    }
}