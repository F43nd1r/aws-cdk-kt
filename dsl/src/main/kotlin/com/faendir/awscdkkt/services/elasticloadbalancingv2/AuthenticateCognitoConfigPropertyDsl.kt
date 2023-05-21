package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@Generated
public
    fun authenticateCognitoConfigProperty(initializer: CfnListenerRule.AuthenticateCognitoConfigProperty.Builder.() -> Unit
    = {}): CfnListenerRule.AuthenticateCognitoConfigProperty =
    CfnListenerRule.AuthenticateCognitoConfigProperty.builder().apply(initializer).build()
