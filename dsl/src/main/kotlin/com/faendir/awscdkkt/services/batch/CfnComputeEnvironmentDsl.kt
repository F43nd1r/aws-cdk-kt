@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnComputeEnvironment
import software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps
import software.constructs.Construct

public fun Construct.cfnComputeEnvironment(
  id: String,
  props: CfnComputeEnvironmentProps,
  initializer: CfnComputeEnvironment.() -> Unit = {},
): CfnComputeEnvironment = CfnComputeEnvironment(this, id, props).apply(initializer)
