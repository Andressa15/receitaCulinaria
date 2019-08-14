package com.receita.repositorys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.receita.models.RecipeModel;

@Repository
public interface RecipeRepository  extends CrudRepository<RecipeModel,Integer> {

}
