package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ManagedInstancesCapacityProvider
import software.amazon.awscdk.services.ecs.ManagedInstancesCapacityProviderProps
import software.constructs.Construct

@Generated
public fun Construct.managedInstancesCapacityProvider(
  id: String,
  props: ManagedInstancesCapacityProviderProps,
  initializer: @AwsCdkDsl ManagedInstancesCapacityProvider.() -> Unit = {},
): ManagedInstancesCapacityProvider = ManagedInstancesCapacityProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildManagedInstancesCapacityProvider(id: String, initializer: @AwsCdkDsl ManagedInstancesCapacityProvider.Builder.() -> Unit = {}): ManagedInstancesCapacityProvider = ManagedInstancesCapacityProvider.Builder.create(this, id).apply(initializer).build()
