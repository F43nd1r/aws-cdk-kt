package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfile
import software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDeviceProfile(id: String, initializer: CfnDeviceProfile.() -> Unit = {}):
    CfnDeviceProfile = CfnDeviceProfile(this, id).apply(initializer)

@Generated
public fun Construct.cfnDeviceProfile(
  id: String,
  props: CfnDeviceProfileProps,
  initializer: CfnDeviceProfile.() -> Unit = {},
): CfnDeviceProfile = CfnDeviceProfile(this, id, props).apply(initializer)
