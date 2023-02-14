package ru.skypro.creating_an_api_postman_4.service;

import ru.skypro.creating_an_api_postman_4.model.Ingredient;

import java.util.Collection;

public interface IngredientService {
    int addIngredient(Ingredient ingredient);
    Ingredient getIngredient(Integer id);

    Collection<Ingredient> getAll();

    Ingredient removeIngredient(int id);

    Ingredient updateIngredient(int id, Ingredient ingredient);
}

