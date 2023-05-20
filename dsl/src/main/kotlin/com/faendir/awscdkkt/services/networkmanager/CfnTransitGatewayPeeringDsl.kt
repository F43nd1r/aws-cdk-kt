@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps
import software.constructs.Construct

public fun Construct.cfnTransitGatewayPeering(
  id: String,
  props: CfnTransitGatewayPeeringProps,
  initializer: CfnTransitGatewayPeering.() -> Unit = {},
): CfnTransitGatewayPeering = CfnTransitGatewayPeering(this, id, props).apply(initializer)
