package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnVirtualGateway.() -> Unit = {},
): CfnVirtualGateway = CfnVirtualGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnVirtualGateway(id: String, initializer: @AwsCdkDsl
    CfnVirtualGateway.Builder.() -> Unit = {}): CfnVirtualGateway =
    CfnVirtualGateway.Builder.create(this, id).apply(initializer).build()
