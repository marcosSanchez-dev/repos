<template>
  <div>
    <router-link to="/">Pokemon List</router-link>
    <router-link to="/id">Pokemon por ID</router-link>
    <router-link to="/about">About</router-link>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
div {
  padding: 0 30px;
}

div a {
  font-weight: bold;
  color: #2c3e50;
  margin: 0 10px;
}
.router-link-exact-active {
  color: red;
}
</style>
