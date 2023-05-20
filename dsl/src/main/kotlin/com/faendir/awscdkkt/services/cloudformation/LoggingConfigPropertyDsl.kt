@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnTypeActivation

public
    fun loggingConfigProperty(initializer: CfnTypeActivation.LoggingConfigProperty.Builder.() -> Unit):
    CfnTypeActivation.LoggingConfigProperty =
    CfnTypeActivation.LoggingConfigProperty.builder().apply(initializer).build()
