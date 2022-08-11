<template>
  <button @click="emitirEvento">{{ texto }}</button>
</template>

<script setup>
// PROPS
const props = defineProps({
  texto: {
    type: String,
    default: "No hay ningun texto",
  },
});
console.log(props.texto);

// EMITS
const emit = defineEmits(["soyUnEmitter"]);

const emitirEvento = () => {
  emit("soyUnEmitter", 50);
};
</script>

<style></style>
