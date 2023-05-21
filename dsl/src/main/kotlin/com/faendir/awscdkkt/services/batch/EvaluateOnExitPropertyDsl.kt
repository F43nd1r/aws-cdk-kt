package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public
    fun evaluateOnExitProperty(initializer: CfnJobDefinition.EvaluateOnExitProperty.Builder.() -> Unit
    = {}): CfnJobDefinition.EvaluateOnExitProperty =
    CfnJobDefinition.EvaluateOnExitProperty.builder().apply(initializer).build()
