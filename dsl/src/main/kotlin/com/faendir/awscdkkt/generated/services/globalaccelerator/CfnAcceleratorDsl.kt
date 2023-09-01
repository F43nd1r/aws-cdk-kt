package com.faendir.awscdkkt.generated.services.globalaccelerator

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnAccelerator.() -> Unit = {},
): CfnAccelerator = CfnAccelerator(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAccelerator(id: String, initializer: @AwsCdkDsl
    CfnAccelerator.Builder.() -> Unit = {}): CfnAccelerator = CfnAccelerator.Builder.create(this,
    id).apply(initializer).build()
