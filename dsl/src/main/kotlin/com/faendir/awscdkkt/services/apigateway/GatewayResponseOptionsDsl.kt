package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.GatewayResponseOptions

@Generated
public fun gatewayResponseOptions(initializer: GatewayResponseOptions.Builder.() -> Unit = {}):
    GatewayResponseOptions = GatewayResponseOptions.builder().apply(initializer).build()
