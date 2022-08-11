<template>
  <h1 @click="cambiaDatos">
    hola mundos mi nombre es {{ name }} y tengo {{ age }} años
  </h1>

  <MyButton
    texto="Soy un prop y puedo cambiar la edad"
    @soyUnEmitter="apretasteElBoton"
  />
</template>

<script setup>
import { ref } from "vue";
import MyButton from "@/components/MyButton.vue";

const name = ref("Marcos");
const age = ref(26);

const cambiaDatos = () => {
  name.value = "Alejandra";
  age.value = 24;
};

const apretasteElBoton = (data) => {
  age.value = data;
};
</script>

<style scoped></style>
