package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnQueue
import software.amazon.awscdk.services.connect.CfnQueueProps
import software.constructs.Construct

@Generated
public fun Construct.cfnQueue(
  id: String,
  props: CfnQueueProps,
  initializer: @AwsCdkDsl CfnQueue.() -> Unit = {},
): CfnQueue = CfnQueue(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnQueue(id: String, initializer: @AwsCdkDsl CfnQueue.Builder.() -> Unit = {}): CfnQueue = CfnQueue.Builder.create(this, id).apply(initializer).build()
