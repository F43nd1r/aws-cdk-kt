@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RestApiAttributes

public fun restApiAttributes(initializer: RestApiAttributes.Builder.() -> Unit): RestApiAttributes =
    RestApiAttributes.builder().apply(initializer).build()
