package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.AsgCapacityProvider
import software.amazon.awscdk.services.ecs.AsgCapacityProviderProps
import software.constructs.Construct

@Generated
public fun Construct.asgCapacityProvider(
  id: String,
  props: AsgCapacityProviderProps,
  initializer: @AwsCdkDsl AsgCapacityProvider.() -> Unit = {},
): AsgCapacityProvider = AsgCapacityProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAsgCapacityProvider(id: String, initializer: @AwsCdkDsl
    AsgCapacityProvider.Builder.() -> Unit = {}): AsgCapacityProvider =
    AsgCapacityProvider.Builder.create(this, id).apply(initializer).build()
