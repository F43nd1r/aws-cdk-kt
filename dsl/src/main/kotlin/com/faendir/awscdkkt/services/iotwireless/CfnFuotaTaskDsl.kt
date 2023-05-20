@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnFuotaTask
import software.amazon.awscdk.services.iotwireless.CfnFuotaTaskProps
import software.constructs.Construct

public fun Construct.cfnFuotaTask(
  id: String,
  props: CfnFuotaTaskProps,
  initializer: CfnFuotaTask.() -> Unit = {},
): CfnFuotaTask = CfnFuotaTask(this, id, props).apply(initializer)
