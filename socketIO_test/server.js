const express = require("express");
const http = require("http");
const socketIo = require("socket.io");
const path = require("path");

const app = express();
const server = http.createServer(app);
const io = socketIo(server);

// Sirviendo archivos estáticos desde la carpeta public
app.use(express.static(path.join(__dirname, "public")));

io.on("connection", (socket) => {
  console.log("Nuevo cliente conectado");

  socket.on("colorChange", (data) => {
    io.emit("colorChanged", data);
  });

  socket.on("disconnect", () => {
    console.log("Cliente desconectado");
  });
});

server.listen(3000, () => {
  console.log("Escuchando en el puerto 3000");
});
