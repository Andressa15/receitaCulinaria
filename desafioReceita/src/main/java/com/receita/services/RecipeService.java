package com.receita.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.receita.models.RecipeModel;
import com.receita.repositorys.RecipeRepository;

@Service
public class RecipeService {
	@Autowired
	private RecipeRepository recipeRepository;

	public void saveRecipe(RecipeModel recipe) {
		recipeRepository.save(recipe);
	}

	public Iterable<RecipeModel> showAll() {
		return recipeRepository.findAll();
	}

	public void deleteRecipe(int id) {
		recipeRepository.deleteById(id);
	}

	public RecipeModel takeTheID(int id) {
		return recipeRepository.findById(id).get();
	}
	public void updateRecipe (RecipeModel recipe, int id ) {
		recipe.setId(id);
		recipeRepository.save(recipe);
	}

	public long quantityOfRecipe() {
		return recipeRepository.count();
	}
}