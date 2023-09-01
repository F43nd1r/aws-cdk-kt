package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApiGatewayManagedOverrides(
  id: String,
  props: CfnApiGatewayManagedOverridesProps,
  initializer: @AwsCdkDsl CfnApiGatewayManagedOverrides.() -> Unit = {},
): CfnApiGatewayManagedOverrides = CfnApiGatewayManagedOverrides(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApiGatewayManagedOverrides(id: String, initializer: @AwsCdkDsl
    CfnApiGatewayManagedOverrides.Builder.() -> Unit = {}): CfnApiGatewayManagedOverrides =
    CfnApiGatewayManagedOverrides.Builder.create(this, id).apply(initializer).build()
