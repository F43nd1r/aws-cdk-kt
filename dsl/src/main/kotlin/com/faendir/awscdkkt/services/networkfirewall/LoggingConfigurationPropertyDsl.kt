package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration

@Generated
public
    fun loggingConfigurationProperty(initializer: CfnLoggingConfiguration.LoggingConfigurationProperty.Builder.() -> Unit
    = {}): CfnLoggingConfiguration.LoggingConfigurationProperty =
    CfnLoggingConfiguration.LoggingConfigurationProperty.builder().apply(initializer).build()
