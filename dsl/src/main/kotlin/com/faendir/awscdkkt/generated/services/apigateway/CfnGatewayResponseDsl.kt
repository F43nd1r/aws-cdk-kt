package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnGatewayResponse
import software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGatewayResponse(id: String, props: CfnGatewayResponseProps):
    CfnGatewayResponse = CfnGatewayResponse(this, id, props)

@Generated
public fun Construct.cfnGatewayResponse(
  id: String,
  props: CfnGatewayResponseProps,
  initializer: @AwsCdkDsl CfnGatewayResponse.() -> Unit,
): CfnGatewayResponse = CfnGatewayResponse(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGatewayResponse(id: String, initializer: @AwsCdkDsl
    CfnGatewayResponse.Builder.() -> Unit): CfnGatewayResponse =
    CfnGatewayResponse.Builder.create(this, id).apply(initializer).build()
