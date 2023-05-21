package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ResourceProps

@Generated
public fun resourceProps(initializer: ResourceProps.Builder.() -> Unit = {}): ResourceProps =
    ResourceProps.builder().apply(initializer).build()
