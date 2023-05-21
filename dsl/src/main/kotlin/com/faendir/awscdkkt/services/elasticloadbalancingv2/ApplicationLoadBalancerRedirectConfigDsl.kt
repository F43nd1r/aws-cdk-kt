package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig

@Generated
public
    fun applicationLoadBalancerRedirectConfig(initializer: ApplicationLoadBalancerRedirectConfig.Builder.() -> Unit
    = {}): ApplicationLoadBalancerRedirectConfig =
    ApplicationLoadBalancerRedirectConfig.builder().apply(initializer).build()
