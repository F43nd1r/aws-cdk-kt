package com.faendir.awscdkkt.generated.services.databrew

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.databrew.CfnRecipe
import software.amazon.awscdk.services.databrew.CfnRecipeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRecipe(id: String, props: CfnRecipeProps): CfnRecipe = CfnRecipe(this, id,
    props)

@Generated
public fun Construct.cfnRecipe(
  id: String,
  props: CfnRecipeProps,
  initializer: @AwsCdkDsl CfnRecipe.() -> Unit,
): CfnRecipe = CfnRecipe(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRecipe(id: String, initializer: @AwsCdkDsl
    CfnRecipe.Builder.() -> Unit): CfnRecipe = CfnRecipe.Builder.create(this,
    id).apply(initializer).build()
