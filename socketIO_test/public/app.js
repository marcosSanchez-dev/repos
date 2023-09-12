const socket = io.connect("http://localhost:3000");

const box = document.getElementById("colorBox");

function changeColor() {
  if (isMobile()) {
    socket.emit("colorChange", "red");
  } else {
    socket.emit("colorChange", "blue");
  }
}

box.addEventListener("click", changeColor);
box.addEventListener("touchstart", function (event) {
  changeColor();
  event.preventDefault(); // Esto evita que se dispare un evento de click adicional
});

socket.on("colorChanged", function (data) {
  box.style.backgroundColor = data;
});

function isMobile() {
  return /Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(
    navigator.userAgent
  );
}
