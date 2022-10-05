<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <input name="nameInput" v-model="name" type="text" placeholder="Enter name..."><button type="submit" v-on:click="greet(name)">Enter</button>
    <HelloWorld :msg="message"/>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'
import GreetingService from "./service/GreetingService";

export default {
  name: 'App',
  components: {
    HelloWorld
  },
  data() {
    return {
      name: '',
      message: ''
    }
  },
  methods: {
    greet() {
      GreetingService.greet(this.name).then(response => {
        this.message = response.data;
      })
    }
  }
}
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
