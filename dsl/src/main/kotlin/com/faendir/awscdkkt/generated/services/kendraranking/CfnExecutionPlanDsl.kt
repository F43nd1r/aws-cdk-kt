package com.faendir.awscdkkt.generated.services.kendraranking

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlan
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps
import software.constructs.Construct

@Generated
public fun Construct.cfnExecutionPlan(id: String, props: CfnExecutionPlanProps): CfnExecutionPlan =
    CfnExecutionPlan(this, id, props)

@Generated
public fun Construct.cfnExecutionPlan(
  id: String,
  props: CfnExecutionPlanProps,
  initializer: @AwsCdkDsl CfnExecutionPlan.() -> Unit,
): CfnExecutionPlan = CfnExecutionPlan(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnExecutionPlan(id: String, initializer: @AwsCdkDsl
    CfnExecutionPlan.Builder.() -> Unit): CfnExecutionPlan = CfnExecutionPlan.Builder.create(this,
    id).apply(initializer).build()
