package com.faendir.awscdkkt.cloudassembly.schema

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.LoadBalancerListenerContextQuery

@Generated
public
    fun loadBalancerListenerContextQuery(initializer: LoadBalancerListenerContextQuery.Builder.() -> Unit
    = {}): LoadBalancerListenerContextQuery =
    LoadBalancerListenerContextQuery.builder().apply(initializer).build()
