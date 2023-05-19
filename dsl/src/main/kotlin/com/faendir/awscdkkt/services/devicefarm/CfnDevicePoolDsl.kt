@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.devicefarm

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devicefarm.CfnDevicePool
import software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps
import software.constructs.Construct

public fun Construct.cfnDevicePool(
  id: String,
  props: CfnDevicePoolProps,
  initializer: CfnDevicePool.() -> Unit = {},
): CfnDevicePool = CfnDevicePool(this, id, props).apply(initializer)
