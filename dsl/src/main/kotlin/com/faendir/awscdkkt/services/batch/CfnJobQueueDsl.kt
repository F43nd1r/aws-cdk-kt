@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobQueue
import software.amazon.awscdk.services.batch.CfnJobQueueProps
import software.constructs.Construct

public fun Construct.cfnJobQueue(
  id: String,
  props: CfnJobQueueProps,
  initializer: CfnJobQueue.() -> Unit = {},
): CfnJobQueue = CfnJobQueue(this, id, props).apply(initializer)
