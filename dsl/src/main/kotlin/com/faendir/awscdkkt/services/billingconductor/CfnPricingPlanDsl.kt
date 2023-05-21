package com.faendir.awscdkkt.services.billingconductor

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.billingconductor.CfnPricingPlan
import software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPricingPlan(
  id: String,
  props: CfnPricingPlanProps,
  initializer: CfnPricingPlan.() -> Unit = {},
): CfnPricingPlan = CfnPricingPlan(this, id, props).apply(initializer)
