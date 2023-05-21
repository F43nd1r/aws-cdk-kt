package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.ResourceEnvironment

@Generated
public fun resourceEnvironment(initializer: ResourceEnvironment.Builder.() -> Unit = {}):
    ResourceEnvironment = ResourceEnvironment.builder().apply(initializer).build()
