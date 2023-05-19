@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes

public
    fun applicationListenerAttributes(initializer: ApplicationListenerAttributes.Builder.() -> Unit):
    ApplicationListenerAttributes =
    ApplicationListenerAttributes.builder().apply(initializer).build()
