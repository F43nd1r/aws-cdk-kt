@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.databrew

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnRecipe
import software.amazon.awscdk.services.databrew.CfnRecipeProps
import software.constructs.Construct

public fun Construct.cfnRecipe(
  id: String,
  props: CfnRecipeProps,
  initializer: CfnRecipe.() -> Unit = {},
): CfnRecipe = CfnRecipe(this, id, props).apply(initializer)
