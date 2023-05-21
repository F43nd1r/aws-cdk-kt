package com.faendir.awscdkkt.services.globalaccelerator.endpoints

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpointOptions

@Generated
public
    fun applicationLoadBalancerEndpointOptions(initializer: ApplicationLoadBalancerEndpointOptions.Builder.() -> Unit
    = {}): ApplicationLoadBalancerEndpointOptions =
    ApplicationLoadBalancerEndpointOptions.builder().apply(initializer).build()
