# On utilise une image légère qui contient l'outil de validation
FROM node:alpine

# Installation d'un mini-serveur pour exposer zxcvbn
RUN npm install -g zxcvbn-cli-server

# L'outil écoutera sur le port 3000
EXPOSE 3000

# Commande pour démarrer le service
CMD ["zxcvbn-cli-server"]