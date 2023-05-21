package com.faendir.awscdkkt.services.networkfirewall

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.networkfirewall.CfnLoggingConfiguration

@Generated
public
    fun logDestinationConfigProperty(initializer: CfnLoggingConfiguration.LogDestinationConfigProperty.Builder.() -> Unit
    = {}): CfnLoggingConfiguration.LogDestinationConfigProperty =
    CfnLoggingConfiguration.LogDestinationConfigProperty.builder().apply(initializer).build()
