<template>
    <div>
        <h2>{{ name }}</h2>
        <p>Height:{{ pokemon.height }}</p>
        <p>Weight:{{ pokemon.weight }}</p>
        <img v-bind:src="spriteImgFront"/> &nbsp;
        <img :src="spriteImgBack"/>
        <img :src="shinySpriteImgFront"/>&nbsp;
        <img :src="shinySpriteImgBack"/>
        <div>
            <button v-on:click="savePokemon">Save as a favorite?</button>
        </div>
    </div>
</template>

<script>
import pokemonService from '../services/PokemonService';
export default{
name:"pokemon-detail",
props:{
    id:Number, 
    String,
    name:String,
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
methods:{
    savePokemon(){
        let pokemonToSave = {
            id:this.id,
            name:this.name,
            url:this.$route.params.url
        };
        pokemonService.saveFavorite(pokemonToSave)
        .then((response)=>{
            console.log(response);
            this.$router.push({name:'pokemon'});
        })
    }

},
created(){
    pokemonService.getPokemonById(this.id).then((response)=>{
            this.pokemon = response.data;
            this.spriteImgFront=response.data.sprites.front_default;
            this.spriteImgBack=response.data.sprites.back_default;
            this.shinySpriteImgFront=response.data.sprites.front_shiny;
            this.shinySpriteImgBack=response.data.sprites.back_shiny;
    })
},
};

</script>

<style>
</style>