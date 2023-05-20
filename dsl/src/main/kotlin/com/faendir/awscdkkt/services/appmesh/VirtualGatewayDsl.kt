@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualGateway
import software.amazon.awscdk.services.appmesh.VirtualGatewayProps
import software.constructs.Construct

public fun Construct.virtualGateway(
  id: String,
  props: VirtualGatewayProps,
  initializer: VirtualGateway.() -> Unit = {},
): VirtualGateway = VirtualGateway(this, id, props).apply(initializer)
