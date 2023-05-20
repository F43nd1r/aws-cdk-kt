@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration

public
    fun loggingConfigurationProperty(initializer: CfnLoggingConfiguration.LoggingConfigurationProperty.Builder.() -> Unit):
    CfnLoggingConfiguration.LoggingConfigurationProperty =
    CfnLoggingConfiguration.LoggingConfigurationProperty.builder().apply(initializer).build()
