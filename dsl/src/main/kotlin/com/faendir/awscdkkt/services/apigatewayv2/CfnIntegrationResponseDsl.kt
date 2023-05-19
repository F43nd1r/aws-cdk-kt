@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps
import software.constructs.Construct

public fun Construct.cfnIntegrationResponse(
  id: String,
  props: CfnIntegrationResponseProps,
  initializer: CfnIntegrationResponse.() -> Unit = {},
): CfnIntegrationResponse = CfnIntegrationResponse(this, id, props).apply(initializer)
