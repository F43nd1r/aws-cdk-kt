package com.faendir.awscdkkt.services.ssmincidents

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
  initializer: CfnResponsePlan.() -> Unit = {},
): CfnResponsePlan = CfnResponsePlan(this, id, props).apply(initializer)
