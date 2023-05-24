package com.faendir.awscdkkt.generated.services.codepipeline.actions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction
import software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps

@Generated
public fun stepFunctionInvokeAction(props: StepFunctionsInvokeActionProps): StepFunctionInvokeAction
    = StepFunctionInvokeAction(props)

@Generated
public fun buildStepFunctionInvokeAction(initializer: @AwsCdkDsl
    StepFunctionInvokeAction.Builder.() -> Unit): StepFunctionInvokeAction =
    StepFunctionInvokeAction.Builder.create().apply(initializer).build()
