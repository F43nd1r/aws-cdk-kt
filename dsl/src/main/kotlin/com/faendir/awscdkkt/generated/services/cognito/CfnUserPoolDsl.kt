package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool
import software.amazon.awscdk.services.cognito.CfnUserPoolProps
import software.constructs.Construct

@Generated
public fun Construct.cfnUserPool(id: String, initializer: @AwsCdkDsl CfnUserPool.() -> Unit = {}): CfnUserPool = CfnUserPool(this, id).apply(initializer)

@Generated
public fun Construct.cfnUserPool(
  id: String,
  props: CfnUserPoolProps,
  initializer: @AwsCdkDsl CfnUserPool.() -> Unit = {},
): CfnUserPool = CfnUserPool(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnUserPool(id: String, initializer: @AwsCdkDsl CfnUserPool.Builder.() -> Unit = {}): CfnUserPool = CfnUserPool.Builder.create(this, id).apply(initializer).build()
