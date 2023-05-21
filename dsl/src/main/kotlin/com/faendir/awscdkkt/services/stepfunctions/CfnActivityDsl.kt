package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CfnActivity
import software.amazon.awscdk.services.stepfunctions.CfnActivityProps
import software.constructs.Construct

@Generated
public fun Construct.cfnActivity(
  id: String,
  props: CfnActivityProps,
  initializer: CfnActivity.() -> Unit = {},
): CfnActivity = CfnActivity(this, id, props).apply(initializer)
