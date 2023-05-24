package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public fun buildLambdaConfigProperty(initializer: @AwsCdkDsl
    CfnUserPool.LambdaConfigProperty.Builder.() -> Unit): CfnUserPool.LambdaConfigProperty =
    CfnUserPool.LambdaConfigProperty.Builder().apply(initializer).build()
