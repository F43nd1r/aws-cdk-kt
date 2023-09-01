package com.faendir.awscdkkt.generated.services.elasticloadbalancing

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener

@Generated
public fun buildLoadBalancerListener(initializer: @AwsCdkDsl LoadBalancerListener.Builder.() -> Unit
    = {}): LoadBalancerListener = LoadBalancerListener.Builder().apply(initializer).build()
