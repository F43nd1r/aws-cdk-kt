package com.faendir.awscdkkt.generated.services.ssmincidents

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlan
import software.amazon.awscdk.services.ssmincidents.CfnResponsePlanProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResponsePlan(
  id: String,
  props: CfnResponsePlanProps,
  initializer: @AwsCdkDsl CfnResponsePlan.() -> Unit = {},
): CfnResponsePlan = CfnResponsePlan(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResponsePlan(id: String, initializer: @AwsCdkDsl
    CfnResponsePlan.Builder.() -> Unit = {}): CfnResponsePlan = CfnResponsePlan.Builder.create(this,
    id).apply(initializer).build()
