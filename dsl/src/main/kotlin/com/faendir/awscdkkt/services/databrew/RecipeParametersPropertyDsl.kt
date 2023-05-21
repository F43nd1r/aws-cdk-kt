package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnRecipe

@Generated
public
    fun recipeParametersProperty(initializer: CfnRecipe.RecipeParametersProperty.Builder.() -> Unit
    = {}): CfnRecipe.RecipeParametersProperty =
    CfnRecipe.RecipeParametersProperty.builder().apply(initializer).build()
