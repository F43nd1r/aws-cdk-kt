package com.faendir.awscdkkt.services.elasticloadbalancing

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

@Generated
public fun listenersProperty(initializer: CfnLoadBalancer.ListenersProperty.Builder.() -> Unit =
    {}): CfnLoadBalancer.ListenersProperty =
    CfnLoadBalancer.ListenersProperty.builder().apply(initializer).build()
