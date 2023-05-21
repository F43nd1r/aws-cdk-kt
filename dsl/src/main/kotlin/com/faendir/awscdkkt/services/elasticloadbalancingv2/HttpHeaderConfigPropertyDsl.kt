package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@Generated
public
    fun httpHeaderConfigProperty(initializer: CfnListenerRule.HttpHeaderConfigProperty.Builder.() -> Unit
    = {}): CfnListenerRule.HttpHeaderConfigProperty =
    CfnListenerRule.HttpHeaderConfigProperty.builder().apply(initializer).build()
