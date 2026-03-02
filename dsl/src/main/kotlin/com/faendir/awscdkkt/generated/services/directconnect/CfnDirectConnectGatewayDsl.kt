package com.faendir.awscdkkt.generated.services.directconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.directconnect.CfnDirectConnectGateway
import software.amazon.awscdk.services.directconnect.CfnDirectConnectGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDirectConnectGateway(
  id: String,
  props: CfnDirectConnectGatewayProps,
  initializer: @AwsCdkDsl CfnDirectConnectGateway.() -> Unit = {},
): CfnDirectConnectGateway = CfnDirectConnectGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDirectConnectGateway(id: String, initializer: @AwsCdkDsl CfnDirectConnectGateway.Builder.() -> Unit = {}): CfnDirectConnectGateway = CfnDirectConnectGateway.Builder.create(this, id).apply(initializer).build()
