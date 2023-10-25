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
    public static void main(String[] args) {CelluleLumineuse cellule1 = new CelluleLumineuse(true); // Crée une cellule allumée
        System.out.println("État initial : " + cellule1.estAllumee()); // Doit afficher "true"

        cellule1.inverserEtat(); // Inversez l'état
        System.out.println("État après inversion : " + cellule1.estAllumee()); // Doit afficher "false"

        CelluleLumineuse cellule2 = new CelluleLumineuse(false); // Crée une cellule éteinte
        System.out.println("État initial : " + cellule2.estAllumee()); // Doit afficher "false"

        cellule2.inverserEtat(); // Inversez l'état
        System.out.println("État après inversion : " + cellule2.estAllumee()); // Doit afficher "true"
    }}
    
    

