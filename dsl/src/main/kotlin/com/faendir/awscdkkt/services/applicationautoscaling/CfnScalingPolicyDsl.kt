@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.applicationautoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps
import software.constructs.Construct

public fun Construct.cfnScalingPolicy(
  id: String,
  props: CfnScalingPolicyProps,
  initializer: CfnScalingPolicy.() -> Unit = {},
): CfnScalingPolicy = CfnScalingPolicy(this, id, props).apply(initializer)
