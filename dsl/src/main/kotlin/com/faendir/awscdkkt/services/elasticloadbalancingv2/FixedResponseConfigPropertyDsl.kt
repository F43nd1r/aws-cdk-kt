@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

public
    fun fixedResponseConfigProperty(initializer: CfnListenerRule.FixedResponseConfigProperty.Builder.() -> Unit):
    CfnListenerRule.FixedResponseConfigProperty =
    CfnListenerRule.FixedResponseConfigProperty.builder().apply(initializer).build()
