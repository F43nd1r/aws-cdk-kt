@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import software.amazon.awscdk.services.appmesh.CfnVirtualGatewayProps
import software.constructs.Construct

public fun Construct.cfnVirtualGateway(
  id: String,
  props: CfnVirtualGatewayProps,
  initializer: CfnVirtualGateway.() -> Unit = {},
): CfnVirtualGateway = CfnVirtualGateway(this, id, props).apply(initializer)
