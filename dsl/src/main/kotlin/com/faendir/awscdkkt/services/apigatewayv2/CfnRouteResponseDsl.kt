@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse
import software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps
import software.constructs.Construct

public fun Construct.cfnRouteResponse(
  id: String,
  props: CfnRouteResponseProps,
  initializer: CfnRouteResponse.() -> Unit = {},
): CfnRouteResponse = CfnRouteResponse(this, id, props).apply(initializer)
