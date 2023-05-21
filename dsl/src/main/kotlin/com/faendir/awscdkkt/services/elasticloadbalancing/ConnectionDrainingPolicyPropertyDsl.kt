package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@Generated
public
    fun connectionDrainingPolicyProperty(initializer: CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder.() -> Unit
    = {}): CfnLoadBalancer.ConnectionDrainingPolicyProperty =
    CfnLoadBalancer.ConnectionDrainingPolicyProperty.builder().apply(initializer).build()
