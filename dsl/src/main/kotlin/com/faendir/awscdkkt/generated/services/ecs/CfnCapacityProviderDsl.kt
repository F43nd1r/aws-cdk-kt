package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCapacityProvider
import software.amazon.awscdk.services.ecs.CfnCapacityProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCapacityProvider(id: String, props: CfnCapacityProviderProps):
    CfnCapacityProvider = CfnCapacityProvider(this, id, props)

@Generated
public fun Construct.cfnCapacityProvider(
  id: String,
  props: CfnCapacityProviderProps,
  initializer: @AwsCdkDsl CfnCapacityProvider.() -> Unit,
): CfnCapacityProvider = CfnCapacityProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCapacityProvider(id: String, initializer: @AwsCdkDsl
    CfnCapacityProvider.Builder.() -> Unit): CfnCapacityProvider =
    CfnCapacityProvider.Builder.create(this, id).apply(initializer).build()
