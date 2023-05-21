package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RestApiProps

@Generated
public fun restApiProps(initializer: RestApiProps.Builder.() -> Unit = {}): RestApiProps =
    RestApiProps.builder().apply(initializer).build()
