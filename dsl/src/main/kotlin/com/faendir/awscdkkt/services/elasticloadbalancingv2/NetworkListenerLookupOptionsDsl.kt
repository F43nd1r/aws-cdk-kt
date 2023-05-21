package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions

@Generated
public fun networkListenerLookupOptions(initializer: NetworkListenerLookupOptions.Builder.() -> Unit
    = {}): NetworkListenerLookupOptions =
    NetworkListenerLookupOptions.builder().apply(initializer).build()
