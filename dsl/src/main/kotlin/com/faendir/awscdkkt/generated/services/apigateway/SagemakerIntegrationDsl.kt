package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.SagemakerIntegration
import software.amazon.awscdk.services.sagemaker.IEndpoint

@Generated
public fun buildSagemakerIntegration(endpoint: IEndpoint, initializer: @AwsCdkDsl
    SagemakerIntegration.Builder.() -> Unit = {}): SagemakerIntegration =
    SagemakerIntegration.Builder.create(endpoint).apply(initializer).build()
