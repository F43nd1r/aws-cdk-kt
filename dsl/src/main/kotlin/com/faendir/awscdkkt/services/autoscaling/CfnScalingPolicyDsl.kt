@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicyProps
import software.constructs.Construct

public fun Construct.cfnScalingPolicy(
  id: String,
  props: CfnScalingPolicyProps,
  initializer: CfnScalingPolicy.() -> Unit = {},
): CfnScalingPolicy = CfnScalingPolicy(this, id, props).apply(initializer)
