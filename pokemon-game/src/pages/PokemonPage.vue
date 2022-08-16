<template>
  <h1 v-if="!pokemon">Espere un momento por favor...</h1>
  <div v-else>
    <h1>¿Quién es este pokemon?</h1>
    <PokemonPicture :pokemonId="pokemon.id" :showPokemon="showPokemon" />
    <PokemonOptions :pokemons="pokemonsArr" @selection="checkAnswer" />
  </div>
  <template v-if="showAnswer" class="fade-in">
    <h2>{{ message }}</h2>
    <button @click="newGame">Nuevo juego</button>
  </template>
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
      pokemon: null,
      showPokemon: false,
      showAnswer: false,
      message: "",
    };
  },
  methods: {
    async mixedPokemonArray() {
      this.pokemonsArr = await getPokemonOptions();
      const randomNumber = Math.floor(Math.random() * this.pokemonsArr.length);
      this.pokemon = this.pokemonsArr[randomNumber];
    },
    checkAnswer(pokemonId) {
      this.showAnswer = true;
      if (pokemonId == this.pokemon.id) {
        this.showPokemon = true;
        this.message = `Correcto :D el pokemon es ${this.pokemon.name}`;
      } else {
        this.showPokemon = true;
        this.message = `Opción incorrecta :( era ${this.pokemon.name}`;
      }
    },
    newGame() {
      this.pokemon = null;
      this.showAnswer = false;
      this.showPokemon = false;
      this.pokemonsArr = [];
      this.mixedPokemonArray();
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
