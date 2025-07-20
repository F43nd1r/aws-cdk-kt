package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnTask
import software.amazon.awscdk.services.datasync.CfnTaskProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTask(
  id: String,
  props: CfnTaskProps,
  initializer: @AwsCdkDsl CfnTask.() -> Unit = {},
): CfnTask = CfnTask(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTask(id: String, initializer: @AwsCdkDsl CfnTask.Builder.() -> Unit = {}): CfnTask = CfnTask.Builder.create(this, id).apply(initializer).build()
