@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.mwaa

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mwaa.CfnEnvironment

public
    fun loggingConfigurationProperty(initializer: CfnEnvironment.LoggingConfigurationProperty.Builder.() -> Unit):
    CfnEnvironment.LoggingConfigurationProperty =
    CfnEnvironment.LoggingConfigurationProperty.builder().apply(initializer).build()
