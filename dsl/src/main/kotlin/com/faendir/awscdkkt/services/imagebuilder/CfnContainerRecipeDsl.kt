@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipeProps
import software.constructs.Construct

public fun Construct.cfnContainerRecipe(
  id: String,
  props: CfnContainerRecipeProps,
  initializer: CfnContainerRecipe.() -> Unit = {},
): CfnContainerRecipe = CfnContainerRecipe(this, id, props).apply(initializer)
