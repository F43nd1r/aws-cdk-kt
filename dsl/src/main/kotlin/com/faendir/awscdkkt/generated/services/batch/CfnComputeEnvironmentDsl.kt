package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnComputeEnvironment
import software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnComputeEnvironment(id: String, props: CfnComputeEnvironmentProps):
    CfnComputeEnvironment = CfnComputeEnvironment(this, id, props)

@Generated
public fun Construct.cfnComputeEnvironment(
  id: String,
  props: CfnComputeEnvironmentProps,
  initializer: @AwsCdkDsl CfnComputeEnvironment.() -> Unit,
): CfnComputeEnvironment = CfnComputeEnvironment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnComputeEnvironment(id: String, initializer: @AwsCdkDsl
    CfnComputeEnvironment.Builder.() -> Unit): CfnComputeEnvironment =
    CfnComputeEnvironment.Builder.create(this, id).apply(initializer).build()
