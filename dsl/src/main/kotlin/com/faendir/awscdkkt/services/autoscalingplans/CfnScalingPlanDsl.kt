package com.faendir.awscdkkt.services.autoscalingplans

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScalingPlan(
  id: String,
  props: CfnScalingPlanProps,
  initializer: CfnScalingPlan.() -> Unit = {},
): CfnScalingPlan = CfnScalingPlan(this, id, props).apply(initializer)
