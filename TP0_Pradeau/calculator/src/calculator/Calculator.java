/*
  * TP0 calculator
   Pradeau Audric TDA
  25/09/23
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        int operator = scanner.nextInt();
        if (operator < 1 || operator > 5) {
            System.out.println("Choisissez un nombre entre 1 et 5.");
            return;
        }

        System.out.println("Entrez un chiffre:");
        int operande1 = scanner.nextInt();

        System.out.println("Entrez un second chiffre:");
        int operande2 = scanner.nextInt();

        int result = 0;

        switch (operator) {
            case 1:
                result = operande1 + operande2;
                break;
            case 2:
                result = operande1 - operande2;
                break;
            case 3:
                result = operande1 * operande2;
                break;
            case 4:
                result = operande1 / operande2;
                break;
            case 5:
                result = operande1 % operande2;
                break;
            
        }

        System.out.println("Le resultat est: " + result);
    }
}


       
    
        
    
    

