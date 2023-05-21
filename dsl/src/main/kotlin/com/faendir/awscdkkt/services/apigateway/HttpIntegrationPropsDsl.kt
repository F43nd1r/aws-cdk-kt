package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.HttpIntegrationProps

@Generated
public fun httpIntegrationProps(initializer: HttpIntegrationProps.Builder.() -> Unit = {}):
    HttpIntegrationProps = HttpIntegrationProps.builder().apply(initializer).build()
