<template>
    <div>
        <h2>{{ pokemon.name }}</h2>
        <p>Height:{{ pokemon.height }}</p>
        <img v-bind:src="spriteImgFront"/> &nbsp;
        <img :src="spriteImgBack"/>
        <img :src="shinySpriteImgFront"/>&nbsp;
        <img :src="shinySpriteImgBack"/>
    </div>
</template>

<script>
import pokemonService from '../services/PokemonService';
export default{
name:"pokemon-detail",
props:{
    id:Number, 
    String,
},
data(){
    return{
        pokemon:{},
        spriteImgFront:"",
        spriteImgBack:"",
        shinySpriteImgFront:"",
        shinySpriteImgBack:"",
    }
},
created(){
    pokemonService.getPokemonById(this.id)
    .then(response=>{
            this.pokemon = response.data;
            this.spriteImgFront=response.data.sprites.front_default;
            this.spriteImgBack=response.data.sprites.back_default;
            this.shinySpriteImgFront=response.data.sprites.front_shiny;
            this.shinySpriteImgBack=response.data.sprites.back_shiny;
    })
}
};

</script>

<style>
</style>