@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.ServiceLoadBalancerAddressOptions

public
    fun serviceLoadBalancerAddressOptions(initializer: ServiceLoadBalancerAddressOptions.Builder.() -> Unit):
    ServiceLoadBalancerAddressOptions =
    ServiceLoadBalancerAddressOptions.builder().apply(initializer).build()
