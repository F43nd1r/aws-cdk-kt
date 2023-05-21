package com.faendir.awscdkkt.services.elasticloadbalancingv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions

@Generated
public fun redirectOptions(initializer: RedirectOptions.Builder.() -> Unit = {}): RedirectOptions =
    RedirectOptions.builder().apply(initializer).build()
