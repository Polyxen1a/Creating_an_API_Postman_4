package ru.skypro.creating_an_api_postman_4.service;

import org.springframework.stereotype.Service;
import ru.skypro.creating_an_api_postman_4.exceptions.IngredientExistsException;
import ru.skypro.creating_an_api_postman_4.model.Ingredient;
import org.webjars.NotFoundException;

import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl {
    private final Map<Integer, Ingredient> ingredientMap = new HashMap<>();
    private static Integer id = 0;

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        if (ingredientMap.containsValue((ingredient))) {
            throw new IngredientExistsException();
        }
        ingredientMap.put(id++, ingredient);
        return ingredient;
    }

    @Override
    public Ingredient getIngredient(Integer id) {
        if (!ingredientMap.containsKey(id)) {
            throw new NotFoundException("Ингредиент с заданным id не найден");
        }
        return ingredientMap.get(id);
    }
}
