package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

@Generated
public
    fun tracingConfigurationProperty(initializer: CfnStateMachine.TracingConfigurationProperty.Builder.() -> Unit
    = {}): CfnStateMachine.TracingConfigurationProperty =
    CfnStateMachine.TracingConfigurationProperty.builder().apply(initializer).build()
