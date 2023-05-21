package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnApi

@Generated
public fun corsProperty(initializer: CfnApi.CorsProperty.Builder.() -> Unit = {}):
    CfnApi.CorsProperty = CfnApi.CorsProperty.builder().apply(initializer).build()
