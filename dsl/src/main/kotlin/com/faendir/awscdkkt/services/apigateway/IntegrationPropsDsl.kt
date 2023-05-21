package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IntegrationProps

@Generated
public fun integrationProps(initializer: IntegrationProps.Builder.() -> Unit = {}): IntegrationProps
    = IntegrationProps.builder().apply(initializer).build()
