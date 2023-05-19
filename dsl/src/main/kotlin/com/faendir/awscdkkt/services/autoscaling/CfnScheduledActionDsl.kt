@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScheduledAction
import software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps
import software.constructs.Construct

public fun Construct.cfnScheduledAction(
  id: String,
  props: CfnScheduledActionProps,
  initializer: CfnScheduledAction.() -> Unit = {},
): CfnScheduledAction = CfnScheduledAction(this, id, props).apply(initializer)
