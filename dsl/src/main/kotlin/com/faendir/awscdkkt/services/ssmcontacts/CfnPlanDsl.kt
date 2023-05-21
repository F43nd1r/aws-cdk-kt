package com.faendir.awscdkkt.services.ssmcontacts

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnPlan
import software.amazon.awscdk.services.ssmcontacts.CfnPlanProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPlan(
  id: String,
  props: CfnPlanProps,
  initializer: CfnPlan.() -> Unit = {},
): CfnPlan = CfnPlan(this, id, props).apply(initializer)
