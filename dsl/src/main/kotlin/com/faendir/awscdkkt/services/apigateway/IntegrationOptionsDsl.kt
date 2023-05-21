package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IntegrationOptions

@Generated
public fun integrationOptions(initializer: IntegrationOptions.Builder.() -> Unit = {}):
    IntegrationOptions = IntegrationOptions.builder().apply(initializer).build()
