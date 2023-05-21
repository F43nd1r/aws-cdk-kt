package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnFlow

@Generated
public
    fun errorHandlingConfigProperty(initializer: CfnFlow.ErrorHandlingConfigProperty.Builder.() -> Unit
    = {}): CfnFlow.ErrorHandlingConfigProperty =
    CfnFlow.ErrorHandlingConfigProperty.builder().apply(initializer).build()
