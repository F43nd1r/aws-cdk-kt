package com.faendir.awscdkkt.generated.services.wellarchitected

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wellarchitected.CfnLens
import software.amazon.awscdk.services.wellarchitected.CfnLensProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLens(id: String, initializer: @AwsCdkDsl CfnLens.() -> Unit = {}): CfnLens = CfnLens(this, id).apply(initializer)

@Generated
public fun Construct.cfnLens(
  id: String,
  props: CfnLensProps,
  initializer: @AwsCdkDsl CfnLens.() -> Unit = {},
): CfnLens = CfnLens(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLens(id: String, initializer: @AwsCdkDsl CfnLens.Builder.() -> Unit = {}): CfnLens = CfnLens.Builder.create(this, id).apply(initializer).build()
