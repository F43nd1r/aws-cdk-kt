package com.faendir.awscdkkt.generated.aws_apigatewayv2_integrations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegration
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkListener

@Generated
public fun buildHttpNlbIntegration(
  id: String,
  listener: INetworkListener,
  initializer: @AwsCdkDsl HttpNlbIntegration.Builder.() -> Unit = {},
): HttpNlbIntegration = HttpNlbIntegration.Builder.create(id, listener).apply(initializer).build()
