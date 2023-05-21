package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@Generated
public
    fun appCookieStickinessPolicyProperty(initializer: CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder.() -> Unit
    = {}): CfnLoadBalancer.AppCookieStickinessPolicyProperty =
    CfnLoadBalancer.AppCookieStickinessPolicyProperty.builder().apply(initializer).build()
