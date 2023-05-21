package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions

@Generated
public fun lambdaIntegrationOptions(initializer: LambdaIntegrationOptions.Builder.() -> Unit = {}):
    LambdaIntegrationOptions = LambdaIntegrationOptions.builder().apply(initializer).build()
