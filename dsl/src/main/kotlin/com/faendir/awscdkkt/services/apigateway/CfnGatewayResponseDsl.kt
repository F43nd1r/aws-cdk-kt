package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnGatewayResponse
import software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGatewayResponse(
  id: String,
  props: CfnGatewayResponseProps,
  initializer: CfnGatewayResponse.() -> Unit = {},
): CfnGatewayResponse = CfnGatewayResponse(this, id, props).apply(initializer)
