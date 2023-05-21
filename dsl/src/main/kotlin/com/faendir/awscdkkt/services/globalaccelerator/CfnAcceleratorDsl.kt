package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.CfnAccelerator
import software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccelerator(
  id: String,
  props: CfnAcceleratorProps,
  initializer: CfnAccelerator.() -> Unit = {},
): CfnAccelerator = CfnAccelerator(this, id, props).apply(initializer)
