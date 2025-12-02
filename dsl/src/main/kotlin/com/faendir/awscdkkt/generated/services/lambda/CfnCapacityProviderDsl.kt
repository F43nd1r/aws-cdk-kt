package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnCapacityProvider
import software.amazon.awscdk.services.lambda.CfnCapacityProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCapacityProvider(
  id: String,
  props: CfnCapacityProviderProps,
  initializer: @AwsCdkDsl CfnCapacityProvider.() -> Unit = {},
): CfnCapacityProvider = CfnCapacityProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCapacityProvider(id: String, initializer: @AwsCdkDsl CfnCapacityProvider.Builder.() -> Unit = {}): CfnCapacityProvider = CfnCapacityProvider.Builder.create(this, id).apply(initializer).build()
