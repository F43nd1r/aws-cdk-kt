@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnDevice
import software.amazon.awscdk.services.networkmanager.CfnDeviceProps
import software.constructs.Construct

public fun Construct.cfnDevice(
  id: String,
  props: CfnDeviceProps,
  initializer: CfnDevice.() -> Unit = {},
): CfnDevice = CfnDevice(this, id, props).apply(initializer)
