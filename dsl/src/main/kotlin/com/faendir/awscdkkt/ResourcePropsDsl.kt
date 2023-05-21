package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.ResourceProps

@Generated
public fun resourceProps(initializer: ResourceProps.Builder.() -> Unit = {}): ResourceProps =
    ResourceProps.builder().apply(initializer).build()
