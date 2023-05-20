@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnWirelessGateway
import software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps
import software.constructs.Construct

public fun Construct.cfnWirelessGateway(
  id: String,
  props: CfnWirelessGatewayProps,
  initializer: CfnWirelessGateway.() -> Unit = {},
): CfnWirelessGateway = CfnWirelessGateway(this, id, props).apply(initializer)
