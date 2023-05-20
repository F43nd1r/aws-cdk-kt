@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides
import software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps
import software.constructs.Construct

public fun Construct.cfnApiGatewayManagedOverrides(
  id: String,
  props: CfnApiGatewayManagedOverridesProps,
  initializer: CfnApiGatewayManagedOverrides.() -> Unit = {},
): CfnApiGatewayManagedOverrides = CfnApiGatewayManagedOverrides(this, id, props).apply(initializer)
