@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnVirtualMFADevice
import software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps
import software.constructs.Construct

public fun Construct.cfnVirtualMFADevice(
  id: String,
  props: CfnVirtualMFADeviceProps,
  initializer: CfnVirtualMFADevice.() -> Unit = {},
): CfnVirtualMFADevice = CfnVirtualMFADevice(this, id, props).apply(initializer)
