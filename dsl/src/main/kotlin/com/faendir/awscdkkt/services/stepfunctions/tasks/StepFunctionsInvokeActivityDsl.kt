package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsInvokeActivity
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsInvokeActivityProps
import software.constructs.Construct

@Generated
public fun Construct.stepFunctionsInvokeActivity(
  id: String,
  props: StepFunctionsInvokeActivityProps,
  initializer: StepFunctionsInvokeActivity.() -> Unit = {},
): StepFunctionsInvokeActivity = StepFunctionsInvokeActivity(this, id, props).apply(initializer)
