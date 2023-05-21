package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@Generated
public
    fun redirectConfigProperty(initializer: CfnListenerRule.RedirectConfigProperty.Builder.() -> Unit
    = {}): CfnListenerRule.RedirectConfigProperty =
    CfnListenerRule.RedirectConfigProperty.builder().apply(initializer).build()
