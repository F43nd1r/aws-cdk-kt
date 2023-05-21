package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecution
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecutionProps
import software.constructs.Construct

@Generated
public fun Construct.stepFunctionsStartExecution(
  id: String,
  props: StepFunctionsStartExecutionProps,
  initializer: StepFunctionsStartExecution.() -> Unit = {},
): StepFunctionsStartExecution = StepFunctionsStartExecution(this, id, props).apply(initializer)
