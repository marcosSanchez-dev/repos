<template>
  <main class="app">
    <section class="greeting">
      <h2 class="title">
        Que onda
        <input type="text" placeholder="Ingresa tu nombre" v-model="name" />
      </h2>
    </section>

    <section class="create-todo">
      <h3>Crea una tarea</h3>

      <form @submit.prevent="agregarTarea">
        <h4>Que hay en tu lista de tareas?</h4>
        <input
          type="text"
          placeholder="por ejemplo: Terminar pendientes"
          v-model="input_content"
        />

        <h4>Elige una categoria</h4>
        <div class="options">
          <label>
            <input
              type="radio"
              name="category"
              value="negocio"
              v-model="input_category"
            />
            <span class="bubble business"></span>
            <div>Negocio</div>
          </label>
          <label>
            <input
              type="radio"
              name="category"
              value="personal"
              v-model="input_category"
            />
            <span class="bubble personal"></span>
            <div>Personal</div>
          </label>
        </div>
        <input type="submit" value="Agregar tarea" />
      </form>
      {{ tareas_asc }}
    </section>
  </main>
</template>

<script setup>
import { ref, onMounted, computed, watch } from "vue";

const tareas = ref([]);
const name = ref("");

const input_content = ref("");
const input_category = ref(null);

const tareas_asc = computed(() => {
  tareas.value.sort((a, b) => {
    return b.createdAt - a.createdAt;
  });
  //   console.log(name.value);
});

watch(
  tareas,
  (newVal) => {
    console.log(JSON.stringify(newVal));
    localStorage.tareas = JSON.stringify(newVal);
  },
  { deep: true }
);

watch(name, (newVal) => {
  localStorage.setItem("name", newVal);
  //   console.log("watch: ", name.value);
});

onMounted(() => {
  name.value = localStorage.name || "";
});

const agregarTarea = () => {
  if (input_content.value.trim() === "" || input_content.value === null) {
    return;
  }

  tareas.value.push({
    contenido: input_content.value,
    categoria: input_category.value,
    done: false,
    createdAt: new Date().getTime(),
  });

  input_content.value = "";
};
</script>

<style scoped></style>
