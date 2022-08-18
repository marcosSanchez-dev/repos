<template>
  <h1>
    Pokemon {{ pokemonName }} #<span>{{ pokemonId }}</span>
  </h1>
  <img :src="imgSrc" :alt="pokemonName" />
</template>

<script>
export default {
  props: {
    pokemonId: {
      type: Number,
      required: true,
    },
  },
  data() {
    return {
      imgSrc: null,
      pokemon: null,
      pokemonName: null,
    };
  },
  created() {
    console.log(this.$route);
    // console.log(this.$route.params.pokemonId);
    this.getPokemon();
  },
  methods: {
    async getPokemon() {
      try {
        const pokemon = await fetch(
          `https://pokeapi.co/api/v2/pokemon/${this.pokemonId}`
        ).then((r) => r.json());

        this.pokemon = pokemon;
        this.pokemonName = pokemon.name;

        this.imgSrc = `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/${this.pokemonId}.svg`;
      } catch (error) {
        this.$router.push("./");
        console.log("estas en el home");
      }
    },
  },
  watch: {
    pokemonId() {
      this.getPokemon();
    },
  },
};
</script>

<style></style>
