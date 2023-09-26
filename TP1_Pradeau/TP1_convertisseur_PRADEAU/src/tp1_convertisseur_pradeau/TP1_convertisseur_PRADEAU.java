/*
 * * TP1 Exercice 2
   Pradeau Audric TDA
  26/09/23
 */
package tp1_convertisseur_pradeau;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class TP1_convertisseur_PRADEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir une valeur en degrés Celsius
        System.out.print("Bonjour, saisissez une valeur : ");
        double valeurCelsius = scanner.nextDouble();

        // Affiche la valeur en degrés Celsius
        System.out.println("Vous avez saisi : " + valeurCelsius + " degrés Celsius.");

        // Affiche le menu des conversions
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        int choix = scanner.nextInt();

        double resultat = 0.0;

        switch (choix) {
            case 1:
                resultat = CelciusVersKelvin(valeurCelsius);
                System.out.println(valeurCelsius + " degres Celsius est egal à " + resultat + " degrés Kelvin.");
                break;
            case 2:
                resultat = KelvinVersCelsius(valeurCelsius);
                System.out.println(valeurCelsius + " degres Kelvin est egal à " + resultat + " degrés Celsius.");
                break;
            case 3:
                resultat = FarenheitVersCelsius(valeurCelsius);
                System.out.println(valeurCelsius + " degres Fahrenheit est egal à " + resultat + " degrés Celsius.");
                break;
            case 4:
                resultat = CelciusVersFarenheit(valeurCelsius);
                System.out.println(valeurCelsius + " degres Celsius est egal à " + resultat + " degrés Fahrenheit.");
                break;
            case 5:
                resultat = KelvinVersFarenheit(valeurCelsius);
                System.out.println(valeurCelsius + " degres Kelvin est egal à " + resultat + " degrés Fahrenheit.");
                break;
            case 6:
                resultat = FarenheitVersKelvin(valeurCelsius);
                System.out.println(valeurCelsius + " degres Fahrenheit est egal à " + resultat + " degrés Kelvin.");
                break;
            default:
                System.out.println("Choix non valide.");
        }
    }

    public static double CelciusVersKelvin(double tCelsius) {
        // Formule de conversion de Celsius vers Kelvin
        return tCelsius + 273.15;
    }

    public static double KelvinVersCelsius(double tKelvin) {
        // Formule de conversion de Kelvin vers Celsius
        return tKelvin - 273.15;
    }

    public static double FarenheitVersCelsius(double tFahrenheit) {
        // Formule de conversion de Fahrenheit vers Celsius
        return (tFahrenheit - 32) * 5 / 9;
    }

    public static double CelciusVersFarenheit(double tCelsius) {
        // Formule de conversion de Celsius vers Fahrenheit
        return (tCelsius * 9 / 5) + 32;
    }

    public static double KelvinVersFarenheit(double tKelvin) {
        // Conversion Kelvin vers Celsius, puis Celsius vers Fahrenheit
        double tCelsius = KelvinVersCelsius(tKelvin);
        return CelciusVersFarenheit(tCelsius);
    }

    public static double FarenheitVersKelvin(double tFahrenheit) {
        // Conversion Fahrenheit vers Celsius, puis Celsius vers Kelvin
        double tCelsius = FarenheitVersCelsius(tFahrenheit);
        return CelciusVersKelvin(tCelsius);
    }
}


   
    
    

