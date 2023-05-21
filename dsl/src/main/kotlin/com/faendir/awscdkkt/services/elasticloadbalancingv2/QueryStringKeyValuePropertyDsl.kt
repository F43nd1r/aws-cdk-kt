package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@Generated
public
    fun queryStringKeyValueProperty(initializer: CfnListenerRule.QueryStringKeyValueProperty.Builder.() -> Unit
    = {}): CfnListenerRule.QueryStringKeyValueProperty =
    CfnListenerRule.QueryStringKeyValueProperty.builder().apply(initializer).build()
