<template>
  <Navbar />
  <img alt="Vue logo" src="./assets/logo.png" />
  <h1>links:</h1>
  <!--  el router-view es un tipo de viewport de los componentes que quieres visualizar  -->
  <router-view></router-view>
</template>

<script>
import { defineAsyncComponent } from "vue";
import AboutPage from "./modules/pokemon/pages/AboutPage.vue";

export default {
  name: "App",
  components: {
    AboutPage,
    Navbar: defineAsyncComponent(() =>
      import(
        /* webpackChunkName: "Navbar" */ "@/modules/shared/components/Navbar.vue"
      )
    ),
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
