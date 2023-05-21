package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@Generated
public
    fun targetGroupStickinessConfigProperty(initializer: CfnListenerRule.TargetGroupStickinessConfigProperty.Builder.() -> Unit
    = {}): CfnListenerRule.TargetGroupStickinessConfigProperty =
    CfnListenerRule.TargetGroupStickinessConfigProperty.builder().apply(initializer).build()
