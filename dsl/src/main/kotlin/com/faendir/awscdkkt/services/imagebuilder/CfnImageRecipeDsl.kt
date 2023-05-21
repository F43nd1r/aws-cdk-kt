package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnImageRecipe(
  id: String,
  props: CfnImageRecipeProps,
  initializer: CfnImageRecipe.() -> Unit = {},
): CfnImageRecipe = CfnImageRecipe(this, id, props).apply(initializer)
