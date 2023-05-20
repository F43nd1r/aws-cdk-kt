@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

public
    fun loggingConfigurationProperty(initializer: CfnStateMachine.LoggingConfigurationProperty.Builder.() -> Unit):
    CfnStateMachine.LoggingConfigurationProperty =
    CfnStateMachine.LoggingConfigurationProperty.builder().apply(initializer).build()
