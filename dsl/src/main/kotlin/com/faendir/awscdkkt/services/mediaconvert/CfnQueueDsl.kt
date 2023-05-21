package com.faendir.awscdkkt.services.mediaconvert

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconvert.CfnQueue
import software.amazon.awscdk.services.mediaconvert.CfnQueueProps
import software.constructs.Construct

@Generated
public fun Construct.cfnQueue(id: String, initializer: CfnQueue.() -> Unit = {}): CfnQueue =
    CfnQueue(this, id).apply(initializer)

@Generated
public fun Construct.cfnQueue(
  id: String,
  props: CfnQueueProps,
  initializer: CfnQueue.() -> Unit = {},
): CfnQueue = CfnQueue(this, id, props).apply(initializer)
