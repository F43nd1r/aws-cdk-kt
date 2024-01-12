package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public fun buildPreTokenGenerationConfigProperty(initializer: @AwsCdkDsl
    CfnUserPool.PreTokenGenerationConfigProperty.Builder.() -> Unit = {}):
    CfnUserPool.PreTokenGenerationConfigProperty =
    CfnUserPool.PreTokenGenerationConfigProperty.Builder().apply(initializer).build()
