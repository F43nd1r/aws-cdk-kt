package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IntegrationResponse

@Generated
public fun integrationResponse(initializer: IntegrationResponse.Builder.() -> Unit = {}):
    IntegrationResponse = IntegrationResponse.builder().apply(initializer).build()
