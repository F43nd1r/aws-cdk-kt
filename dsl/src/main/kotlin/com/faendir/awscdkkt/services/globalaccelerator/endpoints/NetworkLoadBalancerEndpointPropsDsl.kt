package com.faendir.awscdkkt.services.globalaccelerator.endpoints

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps

@Generated
public
    fun networkLoadBalancerEndpointProps(initializer: NetworkLoadBalancerEndpointProps.Builder.() -> Unit
    = {}): NetworkLoadBalancerEndpointProps =
    NetworkLoadBalancerEndpointProps.builder().apply(initializer).build()
