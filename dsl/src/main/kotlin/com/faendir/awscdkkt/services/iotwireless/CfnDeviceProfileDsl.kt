@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfile
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps
import software.constructs.Construct

public fun Construct.cfnDeviceProfile(
  id: String,
  props: CfnDeviceProfileProps,
  initializer: CfnDeviceProfile.() -> Unit = {},
): CfnDeviceProfile = CfnDeviceProfile(this, id, props).apply(initializer)

public fun Construct.cfnDeviceProfile(id: String, initializer: CfnDeviceProfile.() -> Unit = {}):
    CfnDeviceProfile = CfnDeviceProfile(this, id).apply(initializer)
