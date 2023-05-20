@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.CfnAccelerator
import software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps
import software.constructs.Construct

public fun Construct.cfnAccelerator(
  id: String,
  props: CfnAcceleratorProps,
  initializer: CfnAccelerator.() -> Unit = {},
): CfnAccelerator = CfnAccelerator(this, id, props).apply(initializer)
