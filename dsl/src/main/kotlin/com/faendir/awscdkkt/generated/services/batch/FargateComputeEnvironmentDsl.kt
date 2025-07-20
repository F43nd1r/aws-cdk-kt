package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.FargateComputeEnvironment
import software.amazon.awscdk.services.batch.FargateComputeEnvironmentProps
import software.constructs.Construct

@Generated
public fun Construct.fargateComputeEnvironment(
  id: String,
  props: FargateComputeEnvironmentProps,
  initializer: @AwsCdkDsl FargateComputeEnvironment.() -> Unit = {},
): FargateComputeEnvironment = FargateComputeEnvironment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFargateComputeEnvironment(id: String, initializer: @AwsCdkDsl FargateComputeEnvironment.Builder.() -> Unit = {}): FargateComputeEnvironment = FargateComputeEnvironment.Builder.create(this, id).apply(initializer).build()
