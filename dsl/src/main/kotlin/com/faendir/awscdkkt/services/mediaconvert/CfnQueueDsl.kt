@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.mediaconvert

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconvert.CfnQueue
import software.amazon.awscdk.services.mediaconvert.CfnQueueProps
import software.constructs.Construct

public fun Construct.cfnQueue(id: String, initializer: CfnQueue.() -> Unit = {}): CfnQueue =
    CfnQueue(this, id).apply(initializer)

public fun Construct.cfnQueue(
  id: String,
  props: CfnQueueProps,
  initializer: CfnQueue.() -> Unit = {},
): CfnQueue = CfnQueue(this, id, props).apply(initializer)
