package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.LambdaAuthorizerProps

@Generated
public fun lambdaAuthorizerProps(initializer: LambdaAuthorizerProps.Builder.() -> Unit = {}):
    LambdaAuthorizerProps = LambdaAuthorizerProps.builder().apply(initializer).build()
