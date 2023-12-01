package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.EndpointOptions

@Generated
public fun buildEndpointOptions(initializer: @AwsCdkDsl EndpointOptions.Builder.() -> Unit = {}):
    EndpointOptions = EndpointOptions.Builder().apply(initializer).build()
