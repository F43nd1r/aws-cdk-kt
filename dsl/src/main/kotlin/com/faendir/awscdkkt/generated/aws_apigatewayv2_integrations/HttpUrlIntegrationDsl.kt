package com.faendir.awscdkkt.generated.aws_apigatewayv2_integrations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration

@Generated
public fun buildHttpUrlIntegration(
  id: String,
  url: String,
  initializer: @AwsCdkDsl HttpUrlIntegration.Builder.() -> Unit = {},
): HttpUrlIntegration = HttpUrlIntegration.Builder.create(id, url).apply(initializer).build()
