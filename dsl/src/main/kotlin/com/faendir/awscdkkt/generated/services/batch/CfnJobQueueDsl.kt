package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobQueue
import software.amazon.awscdk.services.batch.CfnJobQueueProps
import software.constructs.Construct

@Generated
public fun Construct.cfnJobQueue(id: String, props: CfnJobQueueProps): CfnJobQueue =
    CfnJobQueue(this, id, props)

@Generated
public fun Construct.cfnJobQueue(
  id: String,
  props: CfnJobQueueProps,
  initializer: @AwsCdkDsl CfnJobQueue.() -> Unit,
): CfnJobQueue = CfnJobQueue(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnJobQueue(id: String, initializer: @AwsCdkDsl
    CfnJobQueue.Builder.() -> Unit): CfnJobQueue = CfnJobQueue.Builder.create(this,
    id).apply(initializer).build()
