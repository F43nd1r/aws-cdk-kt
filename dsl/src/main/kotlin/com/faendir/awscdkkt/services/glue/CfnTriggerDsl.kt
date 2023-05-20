@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnTrigger
import software.amazon.awscdk.services.glue.CfnTriggerProps
import software.constructs.Construct

public fun Construct.cfnTrigger(
  id: String,
  props: CfnTriggerProps,
  initializer: CfnTrigger.() -> Unit = {},
): CfnTrigger = CfnTrigger(this, id, props).apply(initializer)
