package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps

@Generated
public fun loadBalancerProps(initializer: LoadBalancerProps.Builder.() -> Unit = {}):
    LoadBalancerProps = LoadBalancerProps.builder().apply(initializer).build()
