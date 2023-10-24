/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armes;
import armes.Arme;



/**
 *
 * @author Utilisateur
 */
public class Epee extends Arme {
    int indice;
    
    public Epee (String n, int i, int f){
        super(n, i);
        if (f>100){
            indice=100;
            
        }
        else{
            indice=f;
        }
    }
    
    
}
