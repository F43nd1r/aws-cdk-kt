package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.ExternalServiceProps

@Generated
public fun externalServiceProps(initializer: ExternalServiceProps.Builder.() -> Unit = {}):
    ExternalServiceProps = ExternalServiceProps.builder().apply(initializer).build()
