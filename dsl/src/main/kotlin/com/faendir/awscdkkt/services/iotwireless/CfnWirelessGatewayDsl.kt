package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnWirelessGateway
import software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWirelessGateway(
  id: String,
  props: CfnWirelessGatewayProps,
  initializer: CfnWirelessGateway.() -> Unit = {},
): CfnWirelessGateway = CfnWirelessGateway(this, id, props).apply(initializer)
