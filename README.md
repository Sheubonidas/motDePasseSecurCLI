# Générateur de Mot de Passe Sécurisé - CLI & Docker

Projet réalisé par **Claude Nouhou** (Licence 3 RGL - Pigier CI).

## Description
Une application Java 21 permettant de générer des mots de passe robustes. La force du mot de passe est validée par un microservice Docker utilisant l'algorithme `zxcvbn`.

## Prérequis
- Docker Desktop
- JDK 21
- Maven

## Installation et Lancement
1. **Lancer le service de validation Docker :**
   ```bash
   docker build -t password-validator .
   docker run -d -p 3000:3000 --name validator-service password-validator
