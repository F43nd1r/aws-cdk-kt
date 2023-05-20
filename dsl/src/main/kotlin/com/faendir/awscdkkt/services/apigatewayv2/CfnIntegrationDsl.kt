@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnIntegration
import software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps
import software.constructs.Construct

public fun Construct.cfnIntegration(
  id: String,
  props: CfnIntegrationProps,
  initializer: CfnIntegration.() -> Unit = {},
): CfnIntegration = CfnIntegration(this, id, props).apply(initializer)
