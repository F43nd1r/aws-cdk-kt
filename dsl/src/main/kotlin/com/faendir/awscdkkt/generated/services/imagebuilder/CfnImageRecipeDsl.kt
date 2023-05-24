package com.faendir.awscdkkt.generated.services.imagebuilder

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnImageRecipe(id: String, props: CfnImageRecipeProps): CfnImageRecipe =
    CfnImageRecipe(this, id, props)

@Generated
public fun Construct.cfnImageRecipe(
  id: String,
  props: CfnImageRecipeProps,
  initializer: @AwsCdkDsl CfnImageRecipe.() -> Unit,
): CfnImageRecipe = CfnImageRecipe(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnImageRecipe(id: String, initializer: @AwsCdkDsl
    CfnImageRecipe.Builder.() -> Unit): CfnImageRecipe = CfnImageRecipe.Builder.create(this,
    id).apply(initializer).build()
