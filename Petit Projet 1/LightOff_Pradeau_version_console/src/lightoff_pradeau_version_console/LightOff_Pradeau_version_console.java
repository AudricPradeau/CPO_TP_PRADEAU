/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_pradeau_version_console;

/**
 *
 * @author Utilisateur
 */
public class LightOff_Pradeau_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {CelluleLumineuse cellule1 = new CelluleLumineuse(true); // Cr�e une cellule allum�e
        System.out.println("�tat initial : " + cellule1.estAllumee()); // Doit afficher "true"

        cellule1.inverserEtat(); // Inversez l'�tat
        System.out.println("�tat apr�s inversion : " + cellule1.estAllumee()); // Doit afficher "false"

        CelluleLumineuse cellule2 = new CelluleLumineuse(false); // Cr�e une cellule �teinte
        System.out.println("�tat initial : " + cellule2.estAllumee()); // Doit afficher "false"

        cellule2.inverserEtat(); // Inversez l'�tat
        System.out.println("�tat apr�s inversion : " + cellule2.estAllumee()); // Doit afficher "true"
    }}
    
    

