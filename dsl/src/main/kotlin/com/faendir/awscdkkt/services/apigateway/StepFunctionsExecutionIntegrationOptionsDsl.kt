package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.StepFunctionsExecutionIntegrationOptions

@Generated
public
    fun stepFunctionsExecutionIntegrationOptions(initializer: StepFunctionsExecutionIntegrationOptions.Builder.() -> Unit
    = {}): StepFunctionsExecutionIntegrationOptions =
    StepFunctionsExecutionIntegrationOptions.builder().apply(initializer).build()
