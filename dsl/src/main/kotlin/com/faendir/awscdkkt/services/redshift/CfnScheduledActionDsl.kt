@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.redshift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshift.CfnScheduledAction
import software.amazon.awscdk.services.redshift.CfnScheduledActionProps
import software.constructs.Construct

public fun Construct.cfnScheduledAction(
  id: String,
  props: CfnScheduledActionProps,
  initializer: CfnScheduledAction.() -> Unit = {},
): CfnScheduledAction = CfnScheduledAction(this, id, props).apply(initializer)
