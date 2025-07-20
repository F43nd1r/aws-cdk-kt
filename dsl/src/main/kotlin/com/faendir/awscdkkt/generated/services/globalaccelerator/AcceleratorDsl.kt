package com.faendir.awscdkkt.generated.services.globalaccelerator

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.globalaccelerator.Accelerator
import software.amazon.awscdk.services.globalaccelerator.AcceleratorProps
import software.constructs.Construct

@Generated
public fun Construct.accelerator(id: String, initializer: @AwsCdkDsl Accelerator.() -> Unit = {}): Accelerator = Accelerator(this, id).apply(initializer)

@Generated
public fun Construct.accelerator(
  id: String,
  props: AcceleratorProps,
  initializer: @AwsCdkDsl Accelerator.() -> Unit = {},
): Accelerator = Accelerator(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAccelerator(id: String, initializer: @AwsCdkDsl Accelerator.Builder.() -> Unit = {}): Accelerator = Accelerator.Builder.create(this, id).apply(initializer).build()
