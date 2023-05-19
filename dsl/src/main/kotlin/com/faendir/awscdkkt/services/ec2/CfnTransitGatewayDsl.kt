@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGateway
import software.amazon.awscdk.services.ec2.CfnTransitGatewayProps
import software.constructs.Construct

public fun Construct.cfnTransitGateway(id: String, initializer: CfnTransitGateway.() -> Unit = {}):
    CfnTransitGateway = CfnTransitGateway(this, id).apply(initializer)

public fun Construct.cfnTransitGateway(
  id: String,
  props: CfnTransitGatewayProps,
  initializer: CfnTransitGateway.() -> Unit = {},
): CfnTransitGateway = CfnTransitGateway(this, id, props).apply(initializer)
