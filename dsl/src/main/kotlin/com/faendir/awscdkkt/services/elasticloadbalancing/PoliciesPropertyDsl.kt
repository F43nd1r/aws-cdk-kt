package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@Generated
public fun policiesProperty(initializer: CfnLoadBalancer.PoliciesProperty.Builder.() -> Unit = {}):
    CfnLoadBalancer.PoliciesProperty =
    CfnLoadBalancer.PoliciesProperty.builder().apply(initializer).build()
