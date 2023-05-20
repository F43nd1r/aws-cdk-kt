@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

public
    fun loggingConfigurationProperty(initializer: CfnStateMachine.LoggingConfigurationProperty.Builder.() -> Unit):
    CfnStateMachine.LoggingConfigurationProperty =
    CfnStateMachine.LoggingConfigurationProperty.builder().apply(initializer).build()
