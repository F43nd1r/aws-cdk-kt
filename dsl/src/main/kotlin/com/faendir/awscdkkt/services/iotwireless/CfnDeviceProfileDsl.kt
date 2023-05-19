@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfile
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps
import software.constructs.Construct

public fun Construct.cfnDeviceProfile(id: String, initializer: CfnDeviceProfile.() -> Unit = {}):
    CfnDeviceProfile = CfnDeviceProfile(this, id).apply(initializer)

public fun Construct.cfnDeviceProfile(
  id: String,
  props: CfnDeviceProfileProps,
  initializer: CfnDeviceProfile.() -> Unit = {},
): CfnDeviceProfile = CfnDeviceProfile(this, id, props).apply(initializer)
