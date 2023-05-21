package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.ApiGatewayProps

@Generated
public fun apiGatewayProps(initializer: ApiGatewayProps.Builder.() -> Unit = {}): ApiGatewayProps =
    ApiGatewayProps.builder().apply(initializer).build()
