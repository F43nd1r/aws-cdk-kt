package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.ManagedEc2EksComputeEnvironment
import software.amazon.awscdk.services.batch.ManagedEc2EksComputeEnvironmentProps
import software.constructs.Construct

@Generated
public fun Construct.managedEc2EksComputeEnvironment(
  id: String,
  props: ManagedEc2EksComputeEnvironmentProps,
  initializer: @AwsCdkDsl ManagedEc2EksComputeEnvironment.() -> Unit = {},
): ManagedEc2EksComputeEnvironment = ManagedEc2EksComputeEnvironment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildManagedEc2EksComputeEnvironment(id: String, initializer: @AwsCdkDsl ManagedEc2EksComputeEnvironment.Builder.() -> Unit = {}): ManagedEc2EksComputeEnvironment = ManagedEc2EksComputeEnvironment.Builder.create(this, id).apply(initializer).build()
