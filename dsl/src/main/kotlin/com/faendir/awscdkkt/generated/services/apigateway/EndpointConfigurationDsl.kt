package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.EndpointConfiguration

@Generated
public fun buildEndpointConfiguration(initializer: @AwsCdkDsl
    EndpointConfiguration.Builder.() -> Unit): EndpointConfiguration =
    EndpointConfiguration.Builder().apply(initializer).build()
