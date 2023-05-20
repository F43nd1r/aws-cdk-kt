@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iot1click

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot1click.CfnDevice
import software.amazon.awscdk.services.iot1click.CfnDeviceProps
import software.constructs.Construct

public fun Construct.cfnDevice(
  id: String,
  props: CfnDeviceProps,
  initializer: CfnDevice.() -> Unit = {},
): CfnDevice = CfnDevice(this, id, props).apply(initializer)
