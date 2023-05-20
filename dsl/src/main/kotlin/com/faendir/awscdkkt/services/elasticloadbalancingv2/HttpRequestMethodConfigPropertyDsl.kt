@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

public
    fun httpRequestMethodConfigProperty(initializer: CfnListenerRule.HttpRequestMethodConfigProperty.Builder.() -> Unit):
    CfnListenerRule.HttpRequestMethodConfigProperty =
    CfnListenerRule.HttpRequestMethodConfigProperty.builder().apply(initializer).build()
