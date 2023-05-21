package com.faendir.awscdkkt.services.ivschat

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration

@Generated
public
    fun destinationConfigurationProperty(initializer: CfnLoggingConfiguration.DestinationConfigurationProperty.Builder.() -> Unit
    = {}): CfnLoggingConfiguration.DestinationConfigurationProperty =
    CfnLoggingConfiguration.DestinationConfigurationProperty.builder().apply(initializer).build()
