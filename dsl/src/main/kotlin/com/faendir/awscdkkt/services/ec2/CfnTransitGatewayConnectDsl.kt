package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayConnect(
  id: String,
  props: CfnTransitGatewayConnectProps,
  initializer: CfnTransitGatewayConnect.() -> Unit = {},
): CfnTransitGatewayConnect = CfnTransitGatewayConnect(this, id, props).apply(initializer)
