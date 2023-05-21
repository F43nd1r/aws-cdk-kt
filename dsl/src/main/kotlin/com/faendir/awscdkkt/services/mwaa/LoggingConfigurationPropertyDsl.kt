package com.faendir.awscdkkt.services.mwaa

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mwaa.CfnEnvironment

@Generated
public
    fun loggingConfigurationProperty(initializer: CfnEnvironment.LoggingConfigurationProperty.Builder.() -> Unit
    = {}): CfnEnvironment.LoggingConfigurationProperty =
    CfnEnvironment.LoggingConfigurationProperty.builder().apply(initializer).build()
