package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnVpcLink
import software.amazon.awscdk.services.apigatewayv2.CfnVpcLinkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVpcLink(
  id: String,
  props: CfnVpcLinkProps,
  initializer: CfnVpcLink.() -> Unit = {},
): CfnVpcLink = CfnVpcLink(this, id, props).apply(initializer)
