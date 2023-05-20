@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

public
    fun authenticateCognitoConfigProperty(initializer: CfnListenerRule.AuthenticateCognitoConfigProperty.Builder.() -> Unit):
    CfnListenerRule.AuthenticateCognitoConfigProperty =
    CfnListenerRule.AuthenticateCognitoConfigProperty.builder().apply(initializer).build()
