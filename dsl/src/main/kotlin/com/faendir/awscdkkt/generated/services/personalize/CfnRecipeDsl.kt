package com.faendir.awscdkkt.generated.services.personalize

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnRecipe
import software.amazon.awscdk.services.personalize.CfnRecipeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRecipe(id: String, initializer: @AwsCdkDsl CfnRecipe.() -> Unit = {}): CfnRecipe = CfnRecipe(this, id).apply(initializer)

@Generated
public fun Construct.cfnRecipe(
  id: String,
  props: CfnRecipeProps,
  initializer: @AwsCdkDsl CfnRecipe.() -> Unit = {},
): CfnRecipe = CfnRecipe(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRecipe(id: String, initializer: @AwsCdkDsl CfnRecipe.Builder.() -> Unit = {}): CfnRecipe = CfnRecipe.Builder.create(this, id).apply(initializer).build()
