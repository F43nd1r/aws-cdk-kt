package com.faendir.awscdkkt.generated.services.iotwireless

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnWirelessDevice.() -> Unit = {},
): CfnWirelessDevice = CfnWirelessDevice(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWirelessDevice(id: String, initializer: @AwsCdkDsl CfnWirelessDevice.Builder.() -> Unit = {}): CfnWirelessDevice = CfnWirelessDevice.Builder.create(this, id).apply(initializer).build()
