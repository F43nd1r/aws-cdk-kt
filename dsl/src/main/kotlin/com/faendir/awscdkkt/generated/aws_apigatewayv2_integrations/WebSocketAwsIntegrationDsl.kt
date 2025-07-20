package com.faendir.awscdkkt.generated.aws_apigatewayv2_integrations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration

@Generated
public fun buildWebSocketAwsIntegration(id: String, initializer: @AwsCdkDsl WebSocketAwsIntegration.Builder.() -> Unit = {}): WebSocketAwsIntegration = WebSocketAwsIntegration.Builder.create(id).apply(initializer).build()
