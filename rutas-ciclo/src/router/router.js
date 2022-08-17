import { createRouter, createWebHashHistory } from "vue-router";

//Importar Rutas

//Definir Rutas
const routes = [
  {
    path: "/",
    component: () =>
      import(
        /* webpackChunkName: "ListPage" */ "@/modules/pokemon/pages/ListPage"
      ),
  },
  {
    path: "/about",
    component: () =>
      import(
        /* webpackChunkName: "AboutPage" */ "@/modules/pokemon/pages/AboutPage"
      ),
  },
  {
    path: "/:pokemonId",
    name: "pokemon-id",
    component: () =>
      import(
        /* webpackChunkName: "PokemonPage" */ "@/modules/pokemon/pages/PokemonPage"
      ),
    props: (route) => {
      // console.log(route);
      const pokemonId = Number(route.params.pokemonId);
      return isNaN(pokemonId) ? { pokemonId: 1 } : { pokemonId };
    },
  },
  {
    path: "/:pathMatch(.*)*",
    component: () =>
      import(
        /* webpackChunkName: "NoPageFound" */ "@/modules/shared/pages/NoPageFound"
      ),
  },
];

//Como se va crear la historia
const router = createRouter({
  history: createWebHashHistory(),
  routes,
});

export default router;
