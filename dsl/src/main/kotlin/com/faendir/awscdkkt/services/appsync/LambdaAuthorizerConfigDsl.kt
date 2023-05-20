@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig

public fun lambdaAuthorizerConfig(initializer: LambdaAuthorizerConfig.Builder.() -> Unit):
    LambdaAuthorizerConfig = LambdaAuthorizerConfig.builder().apply(initializer).build()
