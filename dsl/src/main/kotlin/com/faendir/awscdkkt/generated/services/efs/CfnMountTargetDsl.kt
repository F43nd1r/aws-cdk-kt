package com.faendir.awscdkkt.generated.services.efs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnMountTarget
import software.amazon.awscdk.services.efs.CfnMountTargetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMountTarget(
  id: String,
  props: CfnMountTargetProps,
  initializer: @AwsCdkDsl CfnMountTarget.() -> Unit = {},
): CfnMountTarget = CfnMountTarget(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMountTarget(id: String, initializer: @AwsCdkDsl CfnMountTarget.Builder.() -> Unit = {}): CfnMountTarget = CfnMountTarget.Builder.create(this, id).apply(initializer).build()
