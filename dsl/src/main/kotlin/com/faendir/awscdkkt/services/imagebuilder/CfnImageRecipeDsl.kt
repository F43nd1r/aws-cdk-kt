@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps
import software.constructs.Construct

public fun Construct.cfnImageRecipe(
  id: String,
  props: CfnImageRecipeProps,
  initializer: CfnImageRecipe.() -> Unit = {},
): CfnImageRecipe = CfnImageRecipe(this, id, props).apply(initializer)
