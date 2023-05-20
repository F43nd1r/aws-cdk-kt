@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions

public
    fun ingressLoadBalancerAddressOptions(initializer: IngressLoadBalancerAddressOptions.Builder.() -> Unit):
    IngressLoadBalancerAddressOptions =
    IngressLoadBalancerAddressOptions.builder().apply(initializer).build()
