package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl StepFunctionsInvokeActivity.() -> Unit = {},
): StepFunctionsInvokeActivity = StepFunctionsInvokeActivity(this, id, props).apply(initializer)

@Generated
public fun Construct.buildStepFunctionsInvokeActivity(id: String, initializer: @AwsCdkDsl StepFunctionsInvokeActivity.Builder.() -> Unit = {}): StepFunctionsInvokeActivity = StepFunctionsInvokeActivity.Builder.create(this, id).apply(initializer).build()
