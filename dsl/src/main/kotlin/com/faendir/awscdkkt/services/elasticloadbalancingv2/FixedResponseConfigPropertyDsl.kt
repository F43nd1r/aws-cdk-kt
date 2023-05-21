package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@Generated
public
    fun fixedResponseConfigProperty(initializer: CfnListenerRule.FixedResponseConfigProperty.Builder.() -> Unit
    = {}): CfnListenerRule.FixedResponseConfigProperty =
    CfnListenerRule.FixedResponseConfigProperty.builder().apply(initializer).build()
