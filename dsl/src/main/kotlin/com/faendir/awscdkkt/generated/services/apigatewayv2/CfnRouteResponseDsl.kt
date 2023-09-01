package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse
import software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRouteResponse(
  id: String,
  props: CfnRouteResponseProps,
  initializer: @AwsCdkDsl CfnRouteResponse.() -> Unit = {},
): CfnRouteResponse = CfnRouteResponse(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRouteResponse(id: String, initializer: @AwsCdkDsl
    CfnRouteResponse.Builder.() -> Unit = {}): CfnRouteResponse =
    CfnRouteResponse.Builder.create(this, id).apply(initializer).build()
