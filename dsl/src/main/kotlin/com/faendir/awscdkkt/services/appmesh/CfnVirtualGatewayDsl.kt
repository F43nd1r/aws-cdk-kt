package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import software.amazon.awscdk.services.appmesh.CfnVirtualGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVirtualGateway(
  id: String,
  props: CfnVirtualGatewayProps,
  initializer: CfnVirtualGateway.() -> Unit = {},
): CfnVirtualGateway = CfnVirtualGateway(this, id, props).apply(initializer)
