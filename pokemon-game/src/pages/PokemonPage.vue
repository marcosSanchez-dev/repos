<template>
  <h1>¿Quién es este pokemon?</h1>
  <PokemonPicture :pokemonId="100" :showPokemon="true" />
  <PokemonOptions :pokemons="pokemonsArr" />
</template>

<script>
import PokemonOptions from "../components/PokemonOptions.vue";
import PokemonPicture from "../components/PokemonPicture.vue";
import getPokemonOptions from "../helpers/getPokemonOptions";

export default {
  name: "PokemonPage",
  components: { PokemonPicture, PokemonOptions },
  data() {
    return {
      pokemonsArr: [],
    };
  },
  methods: {
    async mixedPokemonArray() {
      this.pokemonsArr = await getPokemonOptions();
      console.log(this.pokemonsArr);
    },
  },
  mounted() {
    this.mixedPokemonArray();
  },
  setup() {
    return {};
  },
};
</script>
