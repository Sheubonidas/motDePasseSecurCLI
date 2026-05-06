package org.example;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mdpGenerateur gen = new mdpGenerateur();

        System.out.println("GÉNÉRATEUR DE MOT DE PASSE SÉCURISÉ");

        // Configuration de la longueur
        System.out.print("Longueur du mot de passe : ");
        int longueur = scanner.nextInt();

        //Configuration des types de caractères
        System.out.print("Inclure des majuscules ? (true/false) : ");
        boolean majuscule = scanner.nextBoolean();

        System.out.print("Inclure des chiffres ? (true/false) : ");
        boolean chiffres = scanner.nextBoolean();

        System.out.print("Inclure des symboles ? (true/false) : ");
        boolean symboles = scanner.nextBoolean();

        // Mode Rafale
        System.out.print("Combien de mots de passe générer ? (Mode Rafale) : ");
        int quantite = scanner.nextInt();

        System.out.println("\nRÉSULTATS AVEC VALIDATION DOCKER");

        DockerValidator validator = new DockerValidator();

        for (int i = 0; i < quantite; i++) {

            String mdp = gen.generate(longueur, majuscule, chiffres, symboles);
            String scoreLabel = validator.validateScore(mdp);
            System.out.println((i + 1) + ". " + mdp + " | Force : " + scoreLabel);
        }
        System.out.println("\n Merci d'avoir utilisé l'outil de sécurité !");
        scanner.close();
    }
}