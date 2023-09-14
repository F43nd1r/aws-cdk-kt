package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironment
import software.amazon.awscdk.services.batch.ManagedEc2EcsComputeEnvironmentProps
import software.constructs.Construct

@Generated
public fun Construct.managedEc2EcsComputeEnvironment(
  id: String,
  props: ManagedEc2EcsComputeEnvironmentProps,
  initializer: @AwsCdkDsl ManagedEc2EcsComputeEnvironment.() -> Unit = {},
): ManagedEc2EcsComputeEnvironment = ManagedEc2EcsComputeEnvironment(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildManagedEc2EcsComputeEnvironment(id: String, initializer: @AwsCdkDsl
    ManagedEc2EcsComputeEnvironment.Builder.() -> Unit = {}): ManagedEc2EcsComputeEnvironment =
    ManagedEc2EcsComputeEnvironment.Builder.create(this, id).apply(initializer).build()
