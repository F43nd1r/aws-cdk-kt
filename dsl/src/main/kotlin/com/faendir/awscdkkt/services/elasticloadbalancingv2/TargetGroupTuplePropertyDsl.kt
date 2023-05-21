package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@Generated
public
    fun targetGroupTupleProperty(initializer: CfnListenerRule.TargetGroupTupleProperty.Builder.() -> Unit
    = {}): CfnListenerRule.TargetGroupTupleProperty =
    CfnListenerRule.TargetGroupTupleProperty.builder().apply(initializer).build()
