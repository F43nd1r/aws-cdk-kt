package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.AttributeMapping

@Generated
public fun attributeMapping(initializer: AttributeMapping.Builder.() -> Unit = {}): AttributeMapping
    = AttributeMapping.builder().apply(initializer).build()
