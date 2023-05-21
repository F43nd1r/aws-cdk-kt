package com.faendir.awscdkkt.services.ivschat

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration

@Generated
public
    fun firehoseDestinationConfigurationProperty(initializer: CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty.Builder.() -> Unit
    = {}): CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty =
    CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty.builder().apply(initializer).build()
