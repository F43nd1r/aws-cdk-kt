package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@Generated
public
    fun pathPatternConfigProperty(initializer: CfnListenerRule.PathPatternConfigProperty.Builder.() -> Unit
    = {}): CfnListenerRule.PathPatternConfigProperty =
    CfnListenerRule.PathPatternConfigProperty.builder().apply(initializer).build()
