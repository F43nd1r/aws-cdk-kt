@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener

public fun loadBalancerListener(initializer: LoadBalancerListener.Builder.() -> Unit):
    LoadBalancerListener = LoadBalancerListener.builder().apply(initializer).build()
