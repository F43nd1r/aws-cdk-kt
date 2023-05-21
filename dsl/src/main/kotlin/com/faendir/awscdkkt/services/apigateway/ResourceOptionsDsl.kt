package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ResourceOptions

@Generated
public fun resourceOptions(initializer: ResourceOptions.Builder.() -> Unit = {}): ResourceOptions =
    ResourceOptions.builder().apply(initializer).build()
