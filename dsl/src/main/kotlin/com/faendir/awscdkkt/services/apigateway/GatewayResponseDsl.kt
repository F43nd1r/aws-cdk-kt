package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.GatewayResponse
import software.amazon.awscdk.services.apigateway.GatewayResponseProps
import software.constructs.Construct

@Generated
public fun Construct.gatewayResponse(
  id: String,
  props: GatewayResponseProps,
  initializer: GatewayResponse.() -> Unit = {},
): GatewayResponse = GatewayResponse(this, id, props).apply(initializer)
