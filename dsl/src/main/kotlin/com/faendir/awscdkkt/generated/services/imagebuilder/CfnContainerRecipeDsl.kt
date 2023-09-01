package com.faendir.awscdkkt.generated.services.imagebuilder

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnContainerRecipe.() -> Unit = {},
): CfnContainerRecipe = CfnContainerRecipe(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnContainerRecipe(id: String, initializer: @AwsCdkDsl
    CfnContainerRecipe.Builder.() -> Unit = {}): CfnContainerRecipe =
    CfnContainerRecipe.Builder.create(this, id).apply(initializer).build()
