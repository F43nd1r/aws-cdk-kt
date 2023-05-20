@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.billingconductor

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.billingconductor.CfnPricingPlan
import software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps
import software.constructs.Construct

public fun Construct.cfnPricingPlan(
  id: String,
  props: CfnPricingPlanProps,
  initializer: CfnPricingPlan.() -> Unit = {},
): CfnPricingPlan = CfnPricingPlan(this, id, props).apply(initializer)
