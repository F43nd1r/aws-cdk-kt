package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

@Generated
public
    fun loggingConfigurationProperty(initializer: CfnStateMachine.LoggingConfigurationProperty.Builder.() -> Unit
    = {}): CfnStateMachine.LoggingConfigurationProperty =
    CfnStateMachine.LoggingConfigurationProperty.builder().apply(initializer).build()
