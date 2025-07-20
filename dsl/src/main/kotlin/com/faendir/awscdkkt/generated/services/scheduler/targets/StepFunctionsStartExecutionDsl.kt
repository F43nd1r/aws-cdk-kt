package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.targets.StepFunctionsStartExecution
import software.amazon.awscdk.services.stepfunctions.IStateMachine

@Generated
public fun buildStepFunctionsStartExecution(stateMachine: IStateMachine, initializer: @AwsCdkDsl StepFunctionsStartExecution.Builder.() -> Unit = {}): StepFunctionsStartExecution = StepFunctionsStartExecution.Builder.create(stateMachine).apply(initializer).build()
