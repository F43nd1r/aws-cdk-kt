package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener

@Generated
public fun loadBalancerListener(initializer: LoadBalancerListener.Builder.() -> Unit = {}):
    LoadBalancerListener = LoadBalancerListener.builder().apply(initializer).build()
