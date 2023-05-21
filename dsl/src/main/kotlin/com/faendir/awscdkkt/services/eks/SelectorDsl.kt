package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.Selector

@Generated
public fun selector(initializer: Selector.Builder.() -> Unit = {}): Selector =
    Selector.builder().apply(initializer).build()
