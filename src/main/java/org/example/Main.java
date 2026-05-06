package org.example;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mdpGenerateur gen = new mdpGenerateur();

        System.out.println(" GÉNÉRATEUR DE MOT DE PASSE SÉCURISÉ");

        // 1. Configuration de la longueur
        System.out.print("Longueur du mot de passe : ");
        int longueur = scanner.nextInt();

        // 2. Configuration des types de caractères
        System.out.print("Inclure des majuscules ? (true/false) : ");
        boolean majuscule = scanner.nextBoolean();

        System.out.print("Inclure des chiffres ? (true/false) : ");
        boolean chiffres = scanner.nextBoolean();

        System.out.print("Inclure des symboles ? (true/false) : ");
        boolean symboles = scanner.nextBoolean();

        // 3. Mode Rafale
        System.out.print("Combien de mots de passe générer ? (Mode Rafale) : ");
        int quantite = scanner.nextInt();

        System.out.println("\n--- RÉSULTATS ---");

        for (int i = 0; i < quantite; i++) {
            String mdp = gen.generate(longueur, majuscule, chiffres, symboles);

            // Pour l'instant, on affiche une force fictive avant l'étape Docker
            System.out.println((i + 1) + "." + mdp);
        }

        System.out.println("\n Merci d'avoir utilisé l'outil de sécurité !");
        scanner.close();
    }
}