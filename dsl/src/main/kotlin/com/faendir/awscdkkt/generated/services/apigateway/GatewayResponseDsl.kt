package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.GatewayResponse
import software.amazon.awscdk.services.apigateway.GatewayResponseProps
import software.constructs.Construct

@Generated
public fun Construct.gatewayResponse(id: String, props: GatewayResponseProps): GatewayResponse =
    GatewayResponse(this, id, props)

@Generated
public fun Construct.gatewayResponse(
  id: String,
  props: GatewayResponseProps,
  initializer: @AwsCdkDsl GatewayResponse.() -> Unit,
): GatewayResponse = GatewayResponse(this, id, props).apply(initializer)

@Generated
public fun Construct.buildGatewayResponse(id: String, initializer: @AwsCdkDsl
    GatewayResponse.Builder.() -> Unit): GatewayResponse = GatewayResponse.Builder.create(this,
    id).apply(initializer).build()
