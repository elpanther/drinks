package com.timeToDrink.drinks.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;



@JsonIgnoreProperties(ignoreUnknown = true)
public class Drinks {

    public Drinks(Integer idDrink, String strDrink, String strCategory, String strAlcoholic, String strGlass, String strInstructions) {
        this.idDrink = idDrink;
        this.strDrink = strDrink;
        this.strCategory = strCategory;
        this.strAlcoholic = strAlcoholic;
        this.strGlass = strGlass;
        this.strInstructions = strInstructions;
    }


    @JsonProperty("idDrink")
    private Integer idDrink;

    @JsonProperty("strDrink")
    private String strDrink;

    @JsonProperty("strCategory")
    private String strCategory;

    @JsonProperty("strAlcoholic")
    private String strAlcoholic;

    @JsonProperty("strGlass")
    private String strGlass;

    @JsonProperty("strInstructions")
    private String strInstructions;



    public String getStrDrink() {
        return strDrink;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public String getStrAlcoholic() {
        return strAlcoholic;
    }

    public String getStrGlass() {
        return strGlass;
    }

    public String getStrInstructions() {
        return strInstructions;
    }


    public Integer getIdDrink() {
        return idDrink;
    }


    public String getStrDrink(String strDrink) {
        return this.strDrink;
    }




}
