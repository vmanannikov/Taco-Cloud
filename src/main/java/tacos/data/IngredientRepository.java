package tacos.data;

import tacos.Ingredient;

import java.util.Optional;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Optional<Ingredient> findOne(String id);

    Ingredient save(Ingredient ingredient);
}
