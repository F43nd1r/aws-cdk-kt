package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@Generated
public
    fun lBCookieStickinessPolicyProperty(initializer: CfnLoadBalancer.LBCookieStickinessPolicyProperty.Builder.() -> Unit
    = {}): CfnLoadBalancer.LBCookieStickinessPolicyProperty =
    CfnLoadBalancer.LBCookieStickinessPolicyProperty.builder().apply(initializer).build()
