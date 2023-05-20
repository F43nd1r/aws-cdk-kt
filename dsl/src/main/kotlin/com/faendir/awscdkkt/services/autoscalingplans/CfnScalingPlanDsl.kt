@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscalingplans

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps
import software.constructs.Construct

public fun Construct.cfnScalingPlan(
  id: String,
  props: CfnScalingPlanProps,
  initializer: CfnScalingPlan.() -> Unit = {},
): CfnScalingPlan = CfnScalingPlan(this, id, props).apply(initializer)
