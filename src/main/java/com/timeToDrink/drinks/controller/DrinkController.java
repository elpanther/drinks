package com.timeToDrink.drinks.controller;

import com.timeToDrink.drinks.model.Drinks;
import com.timeToDrink.drinks.service.DrinksService;
import com.timeToDrink.drinks.service.DrinksService;
import com.timeToDrink.drinks.model.Drinks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.ArrayList;
import java.io.IOException;

@RestController
public class DrinkController {

    @Autowired
    private DrinksService drinksService;

    @GetMapping("/")
    public ResponseEntity<ArrayList<Drinks>> getDrinks(){
        ArrayList<Drinks> response = new ArrayList<>();
        try{
            response = drinksService.getTodaysDrink();
            } catch (IOException exception) {
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
        }

    }



