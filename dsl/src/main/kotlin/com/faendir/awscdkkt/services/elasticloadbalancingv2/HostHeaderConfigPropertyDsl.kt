package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@Generated
public
    fun hostHeaderConfigProperty(initializer: CfnListenerRule.HostHeaderConfigProperty.Builder.() -> Unit
    = {}): CfnListenerRule.HostHeaderConfigProperty =
    CfnListenerRule.HostHeaderConfigProperty.builder().apply(initializer).build()
