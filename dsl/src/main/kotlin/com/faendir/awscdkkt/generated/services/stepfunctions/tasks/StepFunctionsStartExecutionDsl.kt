package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl StepFunctionsStartExecution.() -> Unit = {},
): StepFunctionsStartExecution = StepFunctionsStartExecution(this, id, props).apply(initializer)

@Generated
public fun Construct.buildStepFunctionsStartExecution(id: String, initializer: @AwsCdkDsl StepFunctionsStartExecution.Builder.() -> Unit = {}): StepFunctionsStartExecution = StepFunctionsStartExecution.Builder.create(this, id).apply(initializer).build()
