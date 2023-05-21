package com.faendir.awscdkkt.services.kendraranking

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlan
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps
import software.constructs.Construct

@Generated
public fun Construct.cfnExecutionPlan(
  id: String,
  props: CfnExecutionPlanProps,
  initializer: CfnExecutionPlan.() -> Unit = {},
): CfnExecutionPlan = CfnExecutionPlan(this, id, props).apply(initializer)
