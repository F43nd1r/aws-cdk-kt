package com.faendir.awscdkkt.generated.services.directconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.directconnect.CfnDirectConnectGatewayAssociation
import software.amazon.awscdk.services.directconnect.CfnDirectConnectGatewayAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDirectConnectGatewayAssociation(
  id: String,
  props: CfnDirectConnectGatewayAssociationProps,
  initializer: @AwsCdkDsl CfnDirectConnectGatewayAssociation.() -> Unit = {},
): CfnDirectConnectGatewayAssociation = CfnDirectConnectGatewayAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDirectConnectGatewayAssociation(id: String, initializer: @AwsCdkDsl CfnDirectConnectGatewayAssociation.Builder.() -> Unit = {}): CfnDirectConnectGatewayAssociation = CfnDirectConnectGatewayAssociation.Builder.create(this, id).apply(initializer).build()
