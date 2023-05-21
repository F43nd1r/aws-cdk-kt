package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ResourceAttributes

@Generated
public fun resourceAttributes(initializer: ResourceAttributes.Builder.() -> Unit = {}):
    ResourceAttributes = ResourceAttributes.builder().apply(initializer).build()
