package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@Generated
public
    fun accessLoggingPolicyProperty(initializer: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit
    = {}): CfnLoadBalancer.AccessLoggingPolicyProperty =
    CfnLoadBalancer.AccessLoggingPolicyProperty.builder().apply(initializer).build()
