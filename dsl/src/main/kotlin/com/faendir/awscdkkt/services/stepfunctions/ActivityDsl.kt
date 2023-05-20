@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Activity
import software.amazon.awscdk.services.stepfunctions.ActivityProps
import software.constructs.Construct

public fun Construct.activity(id: String, initializer: Activity.() -> Unit = {}): Activity =
    Activity(this, id).apply(initializer)

public fun Construct.activity(
  id: String,
  props: ActivityProps,
  initializer: Activity.() -> Unit = {},
): Activity = Activity(this, id, props).apply(initializer)
