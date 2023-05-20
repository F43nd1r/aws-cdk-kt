@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IntegrationConfig

public fun integrationConfig(initializer: IntegrationConfig.Builder.() -> Unit): IntegrationConfig =
    IntegrationConfig.builder().apply(initializer).build()
