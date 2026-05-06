FROM node:alpine

#Création du dossier pour l'application
WORKDIR /app

#Installation de la bibliothèque zxcvbn officielle
RUN npm install zxcvbn express

#Création du serveur docker pour éviter les erreurs
RUN echo 'const express = require("express"); \
const zxcvbn = require("zxcvbn"); \
const app = express(); \
app.get("/score", (req, res) => { \
  const password = req.query.password || ""; \
  const result = zxcvbn(password); \
  res.json({ score: result.score }); \
}); \
app.listen(3000, () => console.log("Validateur prêt sur le port 3000"));' > server.js

EXPOSE 3000

CMD ["node", "server.js"]