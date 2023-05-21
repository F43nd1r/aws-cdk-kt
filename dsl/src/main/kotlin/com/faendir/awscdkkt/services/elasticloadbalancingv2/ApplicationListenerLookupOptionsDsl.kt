package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions

@Generated
public
    fun applicationListenerLookupOptions(initializer: ApplicationListenerLookupOptions.Builder.() -> Unit
    = {}): ApplicationListenerLookupOptions =
    ApplicationListenerLookupOptions.builder().apply(initializer).build()
