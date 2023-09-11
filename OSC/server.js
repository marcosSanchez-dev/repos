const WebSocket = require("ws");
const osc = require("node-osc");

const wss = new WebSocket.Server({ port: 8080 });
const oscClient = new osc.Client("127.0.0.1", 8010); // IP y puerto de MadMapper

wss.on("connection", (ws) => {
  ws.on("message", (message) => {
    try {
      // Asumimos que el mensaje es una cadena JSON con 'address' y 'args' como claves.
      const oscMessage = JSON.parse(message);
      oscClient.send(oscMessage.address, ...oscMessage.args);
    } catch (error) {
      console.error("Error al procesar el mensaje:", error);
    }
  });
});

console.log("Servidor WebSocket escuchando en el puerto 8080");
