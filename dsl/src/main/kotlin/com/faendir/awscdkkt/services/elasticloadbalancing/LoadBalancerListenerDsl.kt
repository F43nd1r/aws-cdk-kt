@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener

public fun loadBalancerListener(initializer: LoadBalancerListener.Builder.() -> Unit):
    LoadBalancerListener = LoadBalancerListener.builder().apply(initializer).build()
