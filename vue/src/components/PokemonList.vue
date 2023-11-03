<template>
    <div>
        <ul>
            <li v-for="pokemon in pokemonArray" v-bind:key="pokemon.id">
            <router-link v-bind:to="{
                name:'detail',
                params:{
                    id:pokemon.id,
                    name:pokemon.name,
                    weight:pokemon.weight
                }}">
                {{ pokemon.name }}
            </router-link>
        </li>
        </ul>
    </div>
</template>

<script>
import pokemonService from '../services/PokemonService';
export default{
    name:'pokemon-list',
    //set up a data to hold an array of pokemon
    data(){
        return {
            pokemonArray :[]
        }
    },
    created(){
        pokemonService.getAllPokemon()
            .then(response => {
                console.log(response);
                this.pokemonArray = response.data;
            })
    }
}
</script>

<style>
ul > li{
    list-style-type: none;
}
</style>