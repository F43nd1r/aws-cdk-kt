@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
