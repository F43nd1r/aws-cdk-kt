package com.faendir.awscdkkt.generated.aws_apigatewayv2_integrations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration
import software.amazon.awscdk.services.servicediscovery.IService

@Generated
public fun buildHttpServiceDiscoveryIntegration(
  id: String,
  service: IService,
  initializer: @AwsCdkDsl HttpServiceDiscoveryIntegration.Builder.() -> Unit = {},
): HttpServiceDiscoveryIntegration = HttpServiceDiscoveryIntegration.Builder.create(id,
    service).apply(initializer).build()
