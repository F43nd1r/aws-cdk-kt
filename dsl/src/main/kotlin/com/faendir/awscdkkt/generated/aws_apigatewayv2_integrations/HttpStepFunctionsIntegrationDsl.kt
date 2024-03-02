package com.faendir.awscdkkt.generated.aws_apigatewayv2_integrations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration

@Generated
public fun buildHttpStepFunctionsIntegration(id: String, initializer: @AwsCdkDsl
    HttpStepFunctionsIntegration.Builder.() -> Unit = {}): HttpStepFunctionsIntegration =
    HttpStepFunctionsIntegration.Builder.create(id).apply(initializer).build()
