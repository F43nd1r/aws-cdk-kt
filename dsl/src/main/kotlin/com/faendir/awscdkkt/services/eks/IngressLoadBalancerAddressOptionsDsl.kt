package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.IngressLoadBalancerAddressOptions

@Generated
public
    fun ingressLoadBalancerAddressOptions(initializer: IngressLoadBalancerAddressOptions.Builder.() -> Unit
    = {}): IngressLoadBalancerAddressOptions =
    IngressLoadBalancerAddressOptions.builder().apply(initializer).build()
