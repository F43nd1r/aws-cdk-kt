@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.StepFunctionsExecutionIntegrationOptions

public
    fun stepFunctionsExecutionIntegrationOptions(initializer: StepFunctionsExecutionIntegrationOptions.Builder.() -> Unit):
    StepFunctionsExecutionIntegrationOptions =
    StepFunctionsExecutionIntegrationOptions.builder().apply(initializer).build()
