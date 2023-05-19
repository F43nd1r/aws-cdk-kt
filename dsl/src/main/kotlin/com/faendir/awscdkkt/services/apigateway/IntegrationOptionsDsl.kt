@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IntegrationOptions

public fun integrationOptions(initializer: IntegrationOptions.Builder.() -> Unit):
    IntegrationOptions = IntegrationOptions.builder().apply(initializer).build()
