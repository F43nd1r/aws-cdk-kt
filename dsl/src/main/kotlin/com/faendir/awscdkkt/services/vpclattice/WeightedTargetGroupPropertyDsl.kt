@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnRule

public
    fun weightedTargetGroupProperty(initializer: CfnRule.WeightedTargetGroupProperty.Builder.() -> Unit):
    CfnRule.WeightedTargetGroupProperty =
    CfnRule.WeightedTargetGroupProperty.builder().apply(initializer).build()
