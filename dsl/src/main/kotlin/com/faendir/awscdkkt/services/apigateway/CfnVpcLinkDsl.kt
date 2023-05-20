@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
