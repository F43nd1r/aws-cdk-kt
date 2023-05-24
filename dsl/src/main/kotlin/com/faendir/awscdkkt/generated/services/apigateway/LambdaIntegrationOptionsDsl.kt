package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions

@Generated
public fun buildLambdaIntegrationOptions(initializer: @AwsCdkDsl
    LambdaIntegrationOptions.Builder.() -> Unit): LambdaIntegrationOptions =
    LambdaIntegrationOptions.Builder().apply(initializer).build()
