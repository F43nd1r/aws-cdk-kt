package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@Generated
public
    fun authenticateOidcConfigProperty(initializer: CfnListenerRule.AuthenticateOidcConfigProperty.Builder.() -> Unit
    = {}): CfnListenerRule.AuthenticateOidcConfigProperty =
    CfnListenerRule.AuthenticateOidcConfigProperty.builder().apply(initializer).build()
