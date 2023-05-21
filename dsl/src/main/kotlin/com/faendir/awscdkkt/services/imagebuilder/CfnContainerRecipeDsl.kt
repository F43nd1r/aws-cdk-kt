package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnContainerRecipe(
  id: String,
  props: CfnContainerRecipeProps,
  initializer: CfnContainerRecipe.() -> Unit = {},
): CfnContainerRecipe = CfnContainerRecipe(this, id, props).apply(initializer)
