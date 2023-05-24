package com.faendir.awscdkkt.generated.services.iotwireless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnFuotaTask
import software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFuotaTask(id: String, props: CfnFuotaTaskProps): CfnFuotaTask =
    CfnFuotaTask(this, id, props)

@Generated
public fun Construct.cfnFuotaTask(
  id: String,
  props: CfnFuotaTaskProps,
  initializer: @AwsCdkDsl CfnFuotaTask.() -> Unit,
): CfnFuotaTask = CfnFuotaTask(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFuotaTask(id: String, initializer: @AwsCdkDsl
    CfnFuotaTask.Builder.() -> Unit): CfnFuotaTask = CfnFuotaTask.Builder.create(this,
    id).apply(initializer).build()
