<template>
  <h1>
    Pokemon #<span>{{ pokemonId }}</span>
  </h1>
</template>

<script>
export default {
  props: {
    pokemonId: {
      type: Number,
      required: true,
    },
  },
  created() {
    // console.log(this.$route);
    // console.log(this.$route.params.pokemonId);
  },
};
</script>

<style></style>
