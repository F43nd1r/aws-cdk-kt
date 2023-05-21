package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RestApiAttributes

@Generated
public fun restApiAttributes(initializer: RestApiAttributes.Builder.() -> Unit = {}):
    RestApiAttributes = RestApiAttributes.builder().apply(initializer).build()
