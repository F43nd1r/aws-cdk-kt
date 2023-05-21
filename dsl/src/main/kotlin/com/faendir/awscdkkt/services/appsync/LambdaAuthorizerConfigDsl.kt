package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig

@Generated
public fun lambdaAuthorizerConfig(initializer: LambdaAuthorizerConfig.Builder.() -> Unit = {}):
    LambdaAuthorizerConfig = LambdaAuthorizerConfig.builder().apply(initializer).build()
