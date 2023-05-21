package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExternalServiceAttributes

@Generated
public fun externalServiceAttributes(initializer: ExternalServiceAttributes.Builder.() -> Unit =
    {}): ExternalServiceAttributes = ExternalServiceAttributes.builder().apply(initializer).build()
