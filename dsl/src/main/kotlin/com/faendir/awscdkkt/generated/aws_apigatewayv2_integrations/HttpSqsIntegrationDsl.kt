package com.faendir.awscdkkt.generated.aws_apigatewayv2_integrations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpSqsIntegration

@Generated
public fun buildHttpSqsIntegration(id: String, initializer: @AwsCdkDsl
    HttpSqsIntegration.Builder.() -> Unit = {}): HttpSqsIntegration =
    HttpSqsIntegration.Builder.create(id).apply(initializer).build()
