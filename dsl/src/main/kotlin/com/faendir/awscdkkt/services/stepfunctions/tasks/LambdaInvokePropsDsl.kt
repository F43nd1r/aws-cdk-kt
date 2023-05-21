package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps

@Generated
public fun lambdaInvokeProps(initializer: LambdaInvokeProps.Builder.() -> Unit = {}):
    LambdaInvokeProps = LambdaInvokeProps.builder().apply(initializer).build()
