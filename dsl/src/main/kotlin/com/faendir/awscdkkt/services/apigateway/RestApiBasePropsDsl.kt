package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RestApiBaseProps

@Generated
public fun restApiBaseProps(initializer: RestApiBaseProps.Builder.() -> Unit = {}): RestApiBaseProps
    = RestApiBaseProps.builder().apply(initializer).build()
