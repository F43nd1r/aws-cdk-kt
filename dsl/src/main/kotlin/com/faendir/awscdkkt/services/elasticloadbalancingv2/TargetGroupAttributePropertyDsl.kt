package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup

@Generated
public
    fun targetGroupAttributeProperty(initializer: CfnTargetGroup.TargetGroupAttributeProperty.Builder.() -> Unit
    = {}): CfnTargetGroup.TargetGroupAttributeProperty =
    CfnTargetGroup.TargetGroupAttributeProperty.builder().apply(initializer).build()
