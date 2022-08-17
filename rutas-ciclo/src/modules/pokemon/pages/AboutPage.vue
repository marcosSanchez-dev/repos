import { onMounted } from 'vue';
<template>
  <h1>about page</h1>
  <hr />
  <h2>{{ nombre }}</h2>
  <button @click="cambiaNombre">Cambia el nombre</button>
</template>

<script>
export default {
  data() {
    return {
      nombre: "Marcos",
    };
  },
  methods: {
    cambiaNombre() {
      this.nombre = "Alejandra";
    },
  },
  beforeCreate() {
    console.log("beforeCreate");
  },
  created() {
    //Peticiones HTTP y leer segmentos de URL
    console.log("created");
  },
  beforeMount() {
    console.log("beforeMount");
  },
  mounted() {
    console.log("mounted");
  },
  beforeUpdate() {
    console.log("beforeUpdate");
  },
  updated() {
    console.log("updated");
  },
  beforeUnmount() {
    console.log("beforeUnmount");
  },
  unmounted() {
    //limpieza de variables
    console.log("unmounted");
  },
  errorCaptured() {
    console.log("errorCaptured");
  },
  renderTracked() {
    console.log("renderTracked");
  },
  renderTriggered() {
    console.log("renderTriggered");
  },
  activated() {
    console.log("activated");
  },
  deactivated() {
    console.log("deactivated");
  },
};
</script>

<style></style>
