package com.faendir.awscdkkt.cxapi

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse

@Generated
public
    fun loadBalancerListenerContextResponse(initializer: LoadBalancerListenerContextResponse.Builder.() -> Unit
    = {}): LoadBalancerListenerContextResponse =
    LoadBalancerListenerContextResponse.builder().apply(initializer).build()
