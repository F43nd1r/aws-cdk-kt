package com.faendir.awscdkkt.generated.services.autoscalingplans

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlanProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScalingPlan(id: String, props: CfnScalingPlanProps): CfnScalingPlan =
    CfnScalingPlan(this, id, props)

@Generated
public fun Construct.cfnScalingPlan(
  id: String,
  props: CfnScalingPlanProps,
  initializer: @AwsCdkDsl CfnScalingPlan.() -> Unit,
): CfnScalingPlan = CfnScalingPlan(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnScalingPlan(id: String, initializer: @AwsCdkDsl
    CfnScalingPlan.Builder.() -> Unit): CfnScalingPlan = CfnScalingPlan.Builder.create(this,
    id).apply(initializer).build()
