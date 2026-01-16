package com.faendir.awscdkkt.generated.aws_apigatewayv2_integrations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpEventBridgeIntegration

@Generated
public fun buildHttpEventBridgeIntegration(id: String, initializer: @AwsCdkDsl HttpEventBridgeIntegration.Builder.() -> Unit = {}): HttpEventBridgeIntegration = HttpEventBridgeIntegration.Builder.create(id).apply(initializer).build()
