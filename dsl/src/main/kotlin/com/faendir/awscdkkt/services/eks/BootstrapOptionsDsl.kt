package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.BootstrapOptions

@Generated
public fun bootstrapOptions(initializer: BootstrapOptions.Builder.() -> Unit = {}): BootstrapOptions
    = BootstrapOptions.builder().apply(initializer).build()
