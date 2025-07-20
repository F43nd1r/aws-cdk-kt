package com.faendir.awscdkkt.generated.services.billingconductor

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnPricingPlan.() -> Unit = {},
): CfnPricingPlan = CfnPricingPlan(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPricingPlan(id: String, initializer: @AwsCdkDsl CfnPricingPlan.Builder.() -> Unit = {}): CfnPricingPlan = CfnPricingPlan.Builder.create(this, id).apply(initializer).build()
