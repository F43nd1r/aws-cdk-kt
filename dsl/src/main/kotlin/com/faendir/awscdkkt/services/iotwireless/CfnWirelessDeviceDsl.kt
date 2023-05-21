package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice
import software.amazon.awscdk.services.iotwireless.CfnWirelessDeviceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWirelessDevice(
  id: String,
  props: CfnWirelessDeviceProps,
  initializer: CfnWirelessDevice.() -> Unit = {},
): CfnWirelessDevice = CfnWirelessDevice(this, id, props).apply(initializer)
