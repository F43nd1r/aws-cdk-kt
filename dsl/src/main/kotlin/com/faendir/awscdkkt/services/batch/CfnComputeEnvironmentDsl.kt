package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnComputeEnvironment
import software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnComputeEnvironment(
  id: String,
  props: CfnComputeEnvironmentProps,
  initializer: CfnComputeEnvironment.() -> Unit = {},
): CfnComputeEnvironment = CfnComputeEnvironment(this, id, props).apply(initializer)
