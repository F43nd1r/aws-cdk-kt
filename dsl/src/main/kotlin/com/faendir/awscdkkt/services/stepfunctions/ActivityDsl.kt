package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Activity
import software.amazon.awscdk.services.stepfunctions.ActivityProps
import software.constructs.Construct

@Generated
public fun Construct.activity(id: String, initializer: Activity.() -> Unit = {}): Activity =
    Activity(this, id).apply(initializer)

@Generated
public fun Construct.activity(
  id: String,
  props: ActivityProps,
  initializer: Activity.() -> Unit = {},
): Activity = Activity(this, id, props).apply(initializer)
