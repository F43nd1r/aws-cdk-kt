package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CapacityProvider
import software.amazon.awscdk.services.lambda.CapacityProviderProps
import software.constructs.Construct

@Generated
public fun Construct.capacityProvider(
  id: String,
  props: CapacityProviderProps,
  initializer: @AwsCdkDsl CapacityProvider.() -> Unit = {},
): CapacityProvider = CapacityProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCapacityProvider(id: String, initializer: @AwsCdkDsl CapacityProvider.Builder.() -> Unit = {}): CapacityProvider = CapacityProvider.Builder.create(this, id).apply(initializer).build()
