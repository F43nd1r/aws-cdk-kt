package com.faendir.awscdkkt.services.billingconductor

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.billingconductor.CfnPricingRule

@Generated
public fun tieringProperty(initializer: CfnPricingRule.TieringProperty.Builder.() -> Unit = {}):
    CfnPricingRule.TieringProperty =
    CfnPricingRule.TieringProperty.builder().apply(initializer).build()
