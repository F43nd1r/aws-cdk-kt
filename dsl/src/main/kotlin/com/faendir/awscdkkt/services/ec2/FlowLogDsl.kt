@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.FlowLog
import software.amazon.awscdk.services.ec2.FlowLogProps
import software.constructs.Construct

public fun Construct.flowLog(
  id: String,
  props: FlowLogProps,
  initializer: FlowLog.() -> Unit = {},
): FlowLog = FlowLog(this, id, props).apply(initializer)
