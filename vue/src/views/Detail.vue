<template>
    <div>
        <pokemon-detail v-bind:id="$route.params.id"
        :name="$route.params.name"
        :weight="$route.params.weight"/>
        
    </div>
</template>

<script>
import PokemonDetail from '../components/PokemonDetail.vue'
export default{
    name:'detail',
    components:{
        PokemonDetail
    }

};
</script>

<style>
</style>