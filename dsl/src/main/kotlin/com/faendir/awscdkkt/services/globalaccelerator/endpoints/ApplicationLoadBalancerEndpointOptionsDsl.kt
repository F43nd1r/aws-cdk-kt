@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.globalaccelerator.endpoints

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.endpoints.ApplicationLoadBalancerEndpointOptions

public
    fun applicationLoadBalancerEndpointOptions(initializer: ApplicationLoadBalancerEndpointOptions.Builder.() -> Unit):
    ApplicationLoadBalancerEndpointOptions =
    ApplicationLoadBalancerEndpointOptions.builder().apply(initializer).build()
