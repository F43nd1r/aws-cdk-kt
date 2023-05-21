package com.faendir.awscdkkt.services.mwaa

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mwaa.CfnEnvironment

@Generated
public
    fun moduleLoggingConfigurationProperty(initializer: CfnEnvironment.ModuleLoggingConfigurationProperty.Builder.() -> Unit
    = {}): CfnEnvironment.ModuleLoggingConfigurationProperty =
    CfnEnvironment.ModuleLoggingConfigurationProperty.builder().apply(initializer).build()
