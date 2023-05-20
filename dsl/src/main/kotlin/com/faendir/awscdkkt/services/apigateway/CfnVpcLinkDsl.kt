@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnVpcLink
import software.amazon.awscdk.services.apigateway.CfnVpcLinkProps
import software.constructs.Construct

public fun Construct.cfnVpcLink(
  id: String,
  props: CfnVpcLinkProps,
  initializer: CfnVpcLink.() -> Unit = {},
): CfnVpcLink = CfnVpcLink(this, id, props).apply(initializer)
