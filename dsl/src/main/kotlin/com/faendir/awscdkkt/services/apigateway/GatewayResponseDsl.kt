@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.GatewayResponse
import software.amazon.awscdk.services.apigateway.GatewayResponseProps
import software.constructs.Construct

public fun Construct.gatewayResponse(
  id: String,
  props: GatewayResponseProps,
  initializer: GatewayResponse.() -> Unit = {},
): GatewayResponse = GatewayResponse(this, id, props).apply(initializer)
