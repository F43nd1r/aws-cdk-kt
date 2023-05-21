package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public fun lambdaConfigProperty(initializer: CfnUserPool.LambdaConfigProperty.Builder.() -> Unit =
    {}): CfnUserPool.LambdaConfigProperty =
    CfnUserPool.LambdaConfigProperty.builder().apply(initializer).build()
