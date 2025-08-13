package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectPeer
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectPeerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayConnectPeer(
  id: String,
  props: CfnTransitGatewayConnectPeerProps,
  initializer: @AwsCdkDsl CfnTransitGatewayConnectPeer.() -> Unit = {},
): CfnTransitGatewayConnectPeer = CfnTransitGatewayConnectPeer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayConnectPeer(id: String, initializer: @AwsCdkDsl CfnTransitGatewayConnectPeer.Builder.() -> Unit = {}): CfnTransitGatewayConnectPeer = CfnTransitGatewayConnectPeer.Builder.create(this, id).apply(initializer).build()
