@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect
import software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps
import software.constructs.Construct

public fun Construct.cfnTransitGatewayConnect(
  id: String,
  props: CfnTransitGatewayConnectProps,
  initializer: CfnTransitGatewayConnect.() -> Unit = {},
): CfnTransitGatewayConnect = CfnTransitGatewayConnect(this, id, props).apply(initializer)
