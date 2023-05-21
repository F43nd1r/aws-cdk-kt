package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.StepFunctionsStartExecutionProps

@Generated
public
    fun stepFunctionsStartExecutionProps(initializer: StepFunctionsStartExecutionProps.Builder.() -> Unit
    = {}): StepFunctionsStartExecutionProps =
    StepFunctionsStartExecutionProps.builder().apply(initializer).build()
