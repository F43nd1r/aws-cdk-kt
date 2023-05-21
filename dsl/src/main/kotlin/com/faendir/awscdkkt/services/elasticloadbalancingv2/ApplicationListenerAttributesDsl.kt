package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes

@Generated
public
    fun applicationListenerAttributes(initializer: ApplicationListenerAttributes.Builder.() -> Unit
    = {}): ApplicationListenerAttributes =
    ApplicationListenerAttributes.builder().apply(initializer).build()
