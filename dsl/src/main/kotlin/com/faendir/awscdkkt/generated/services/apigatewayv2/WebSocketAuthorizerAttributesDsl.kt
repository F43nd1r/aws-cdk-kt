package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes

@Generated
public fun buildWebSocketAuthorizerAttributes(initializer: @AwsCdkDsl
    WebSocketAuthorizerAttributes.Builder.() -> Unit = {}): WebSocketAuthorizerAttributes =
    WebSocketAuthorizerAttributes.Builder().apply(initializer).build()
