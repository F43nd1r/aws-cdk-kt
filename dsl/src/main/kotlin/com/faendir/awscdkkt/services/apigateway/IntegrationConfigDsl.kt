package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IntegrationConfig

@Generated
public fun integrationConfig(initializer: IntegrationConfig.Builder.() -> Unit = {}):
    IntegrationConfig = IntegrationConfig.builder().apply(initializer).build()
