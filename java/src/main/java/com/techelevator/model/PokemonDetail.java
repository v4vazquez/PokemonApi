package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PokemonDetail {

    private int id;
    //the jsON is called base_experience but we can map it to baseExperience
    @JsonProperty("base_experience")
    private int baseExperience;
    private int height;
    private int weight;

    private Sprite sprite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    @Override
    public String toString() {
        return "PokemonDetail{" +
                "id=" + id +
                ", baseExperience=" + baseExperience +
                ", height=" + height +
                ", weight=" + weight +
                ", sprite=" + sprite +
                '}';
    }
}
