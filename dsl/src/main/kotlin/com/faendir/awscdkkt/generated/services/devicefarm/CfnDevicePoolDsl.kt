package com.faendir.awscdkkt.generated.services.devicefarm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.devicefarm.CfnDevicePool
import software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDevicePool(
  id: String,
  props: CfnDevicePoolProps,
  initializer: @AwsCdkDsl CfnDevicePool.() -> Unit = {},
): CfnDevicePool = CfnDevicePool(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDevicePool(id: String, initializer: @AwsCdkDsl CfnDevicePool.Builder.() -> Unit = {}): CfnDevicePool = CfnDevicePool.Builder.create(this, id).apply(initializer).build()
