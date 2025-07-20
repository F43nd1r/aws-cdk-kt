package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.VirtualGateway
import software.amazon.awscdk.services.appmesh.VirtualGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.virtualGateway(
  id: String,
  props: VirtualGatewayProps,
  initializer: @AwsCdkDsl VirtualGateway.() -> Unit = {},
): VirtualGateway = VirtualGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildVirtualGateway(id: String, initializer: @AwsCdkDsl VirtualGateway.Builder.() -> Unit = {}): VirtualGateway = VirtualGateway.Builder.create(this, id).apply(initializer).build()
