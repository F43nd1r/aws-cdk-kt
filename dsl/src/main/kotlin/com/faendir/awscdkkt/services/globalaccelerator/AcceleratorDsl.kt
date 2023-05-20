@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.globalaccelerator

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.Accelerator
import software.amazon.awscdk.services.globalaccelerator.AcceleratorProps
import software.constructs.Construct

public fun Construct.accelerator(id: String, initializer: Accelerator.() -> Unit = {}): Accelerator
    = Accelerator(this, id).apply(initializer)

public fun Construct.accelerator(
  id: String,
  props: AcceleratorProps,
  initializer: Accelerator.() -> Unit = {},
): Accelerator = Accelerator(this, id, props).apply(initializer)
