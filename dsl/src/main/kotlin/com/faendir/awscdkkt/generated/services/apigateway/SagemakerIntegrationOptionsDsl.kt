package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.SagemakerIntegrationOptions

@Generated
public fun buildSagemakerIntegrationOptions(initializer: @AwsCdkDsl
    SagemakerIntegrationOptions.Builder.() -> Unit = {}): SagemakerIntegrationOptions =
    SagemakerIntegrationOptions.Builder().apply(initializer).build()
