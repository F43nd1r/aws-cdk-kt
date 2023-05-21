package com.faendir.awscdkkt.services.codepipeline.actions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps

@Generated
public
    fun stepFunctionsInvokeActionProps(initializer: StepFunctionsInvokeActionProps.Builder.() -> Unit
    = {}): StepFunctionsInvokeActionProps =
    StepFunctionsInvokeActionProps.builder().apply(initializer).build()
