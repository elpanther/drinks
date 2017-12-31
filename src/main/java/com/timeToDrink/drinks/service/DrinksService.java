package com.timeToDrink.drinks.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.timeToDrink.drinks.model.Drinks;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class DrinksService {


    public ArrayList<Drinks> getTodaysDrink() throws IOException {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> drankys = restTemplate.getForEntity("http://www.thecocktaildb.com/api/json/v1/1/random.php?", String.class);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(drankys.getBody());
        JsonNode drinks = root.path("drinks");

        JsonNode beverage = drinks.get(0);

        ArrayList<Drinks> drinksIngredients = new ArrayList<>();

        drinksIngredients.add(new Drinks(beverage.get("idDrink").asInt(),
                beverage.get("strDrink").textValue(),
                beverage.get("strCategory").textValue(),
                beverage.get("strAlcoholic").textValue(),
                beverage.get("strGlass").textValue(),
                beverage.get("strInstructions").textValue()));


//        for (JsonNode node : drinks ){
//            JsonNode todaysDrink = node.get("drinks");
//
//            Drinks drinks1 = new Drinks();
//            drinks1.setStrDrink(todaysDrink.get("strDrink").textValue());
//            drinksIngredients.add(drinks1);
//        }

        return drinksIngredients;
    }



}
