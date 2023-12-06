package com.faendir.awscdkkt.generated.aws_apigatewayv2_integrations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener

@Generated
public fun buildHttpAlbIntegration(
  id: String,
  listener: IApplicationListener,
  initializer: @AwsCdkDsl HttpAlbIntegration.Builder.() -> Unit = {},
): HttpAlbIntegration = HttpAlbIntegration.Builder.create(id, listener).apply(initializer).build()
