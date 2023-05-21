package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnVirtualMFADevice
import software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVirtualMFADevice(
  id: String,
  props: CfnVirtualMFADeviceProps,
  initializer: CfnVirtualMFADevice.() -> Unit = {},
): CfnVirtualMFADevice = CfnVirtualMFADevice(this, id, props).apply(initializer)
