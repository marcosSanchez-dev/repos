import { computed, onMounted } from 'vue';
<script setup>
import { ref, computed, onMounted } from "vue";

const query = ref("");
const mi_anime = ref([]);
const resultados_busqueda = ref([]);

const mi_anime_asce = computed(() => {
  return mi_anime.value.sort((a, b) => {
    console.log(a.title.localCompare(b.title));
    return a.title.localCompare(b.title); //regresa un numero negativo si "a" es alfabeticamente menos que "b" o regresar un valor positivo en caso contrario
  });
});

const buscarAnime = () => {
  const url = `https://api.jikan.moe/v4/anime?q=${query.value}`;
  fetch(url)
    .then((res) => {
      console.log("respuesta before JSON: ", res);
      return res.json();
    })
    .then((res) => {
      console.log("respues after Json: ", res);
      console.log("data de la respuesta: ", res.data);
      return (resultados_busqueda.value = res.data);
    });
};

const handleInput = (e) => {
  if (!e.target.value) {
    resultados_busqueda.value = [];
  }
};

const agregarAnime = (anime) => {
  resultados_busqueda.value = [];
  query.value = "";

  mi_anime.value.push({
    id: anime.mal_id,
    title: anime.title,
    image: anime.images.jpg.image_url,
    episodios_totales: anime.episodes,
    episodios_vistos: 0,
  });

  localStorage.setItem("mi_anime", JSON.stringify(mi_anime.value));
};

const increaseCounter = (anime) => {
  anime.episodios_vistos++;
  localStorage.setItem("mi_anime", JSON.stringify(mi_anime.value));
};

const decreaseCounter = (anime) => {
  anime.episodios_vistos--;
  localStorage.setItem("mi_anime", JSON.stringify(mi_anime.value));
};

onMounted(() => {
  mi_anime.value = JSON.parse(localStorage.getItem("mi_anime")) || [];
});
</script>

<template>
  <main>
    <h1>Mi anime tracker</h1>

    <form @submit.prevent="buscarAnime">
      <input
        type="text"
        placeholder="busca el Anime"
        v-model="query"
        @input="handleInput"
      />
      <button type="submit">Buscar</button>
    </form>

    <div class="results" v-if="resultados_busqueda.length > 0">
      <div
        class="result"
        v-for="anime in resultados_busqueda"
        :key="anime.mal_id"
      >
        <img :src="anime.images.jpg.image_url" :alt="anime.title" />
        <div class="details">
          <h3>{{ anime.title }}</h3>
          <p :title="anime.synopsis" v-if="anime.synopsis">
            {{ anime.synopsis.slice(0, 120) }}...
          </p>
          <span class="flex-1"></span>
          <button @click="agregarAnime(anime)">Agregar a mis animes</button>
        </div>
      </div>
    </div>

    <div class="myanime" v-if="mi_anime.length > 0">
      <h2>Mis animes</h2>
      <div v-for="anime in mi_anime_asce" :key="anime.mal_id" class="anime">
        <img :src="anime.image" :alt="anime.title" />
        <h3>{{ anime.title }}</h3>
        <div class="flex-1"></div>
        <span class="episodes">
          {{ anime.episodios_vistos }} / {{ anime.episodios_totales }}
        </span>
        <button
          v-if="anime.episodios_totales !== anime.episodios_vistos"
          @click="increaseCounter(anime)"
        >
          +
        </button>
        <button
          v-if="anime.episodios_vistos > 0"
          @click="decreaseCounter(anime)"
        >
          -
        </button>
      </div>
    </div>
  </main>
</template>

<style scoped>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Fira Sans", sans-serif;
}

body {
  background-color: #eee;
}

main {
  margin: 0 auto;
  max-width: 768px;
  padding: 1.5rem;
}

h1 {
  text-align: center;
  margin-bottom: 1.5rem;
}

form {
  display: flex;
  max-width: 480px;
  margin: 0 auto 1.5rem;
}

form input {
  appearance: none;
  outline: none;
  border: none;
  background: white;

  display: block;
  color: #888;
  font-size: 1.125rem;
  padding: 0.5rem 1rem;
  width: 100%;
}

.button {
  appearance: none;
  outline: none;
  border: none;
  background: none;
  cursor: pointer;

  display: block;
  padding: 0.5rem 1rem;
  background-image: linear-gradient(to right, deeppink 50%, darkviolet 50%);
  background-size: 200%;
  color: white;
  font-size: 1.125rem;
  font-weight: bold;
  text-transform: uppercase;
  transition: 0.4s;
}

.button:hover {
  background-position: right;
}

.results {
  background-color: #fff;
  border-radius: 0.5rem;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  max-height: 480px;
  overflow-y: scroll;
  margin-bottom: 1.5rem;
}

.result {
  display: flex;
  margin: 1rem;
  padding: 1rem;
  border: 1px solid #ccc;
  border-radius: 5px;
  transition: 0.4s;
}

.result img {
  width: 100px;
  border-radius: 1rem;
  margin-right: 1rem;
}

.details {
  flex: 1 1 0%;
  display: flex;
  align-items: flex-start;
  flex-direction: column;
}

.details h3 {
  font-size: 1.25rem;
  margin-bottom: 0.5rem;
}

.details p {
  font-size: 0.875rem;
  margin-bottom: 1rem;
}

.details .button {
  margin-left: auto;
}

.flex-1 {
  display: block;
  flex: 1 1 0%;
}

.myanime h2 {
  color: #888;
  font-weight: 400;
  margin-bottom: 1.5rem;
}

.myanime .anime {
  display: flex;
  align-items: center;
  margin-bottom: 1.5rem;
  background-color: #fff;
  padding: 1rem;
  border-radius: 0.5rem;
  box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.1);
}

.anime img {
  width: 72px;
  height: 72px;
  object-fit: cover;
  border-radius: 1rem;
  margin-right: 1rem;
}

.anime h3 {
  color: #888;
  font-size: 1.125rem;
}

.anime .episodes {
  margin-right: 1rem;
  color: #888;
}

.anime .button:first-of-type {
  margin-right: 0.5rem;
}

.anime .button:last-of-type {
  margin-right: 0;
}
</style>
