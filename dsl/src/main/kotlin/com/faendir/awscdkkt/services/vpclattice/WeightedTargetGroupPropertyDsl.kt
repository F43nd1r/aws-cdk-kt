package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnRule

@Generated
public
    fun weightedTargetGroupProperty(initializer: CfnRule.WeightedTargetGroupProperty.Builder.() -> Unit
    = {}): CfnRule.WeightedTargetGroupProperty =
    CfnRule.WeightedTargetGroupProperty.builder().apply(initializer).build()
