package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIntegrationResponse(
  id: String,
  props: CfnIntegrationResponseProps,
  initializer: @AwsCdkDsl CfnIntegrationResponse.() -> Unit = {},
): CfnIntegrationResponse = CfnIntegrationResponse(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIntegrationResponse(id: String, initializer: @AwsCdkDsl CfnIntegrationResponse.Builder.() -> Unit = {}): CfnIntegrationResponse = CfnIntegrationResponse.Builder.create(this, id).apply(initializer).build()
