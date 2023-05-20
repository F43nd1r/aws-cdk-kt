@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
