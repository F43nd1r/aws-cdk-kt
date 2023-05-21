package com.faendir.awscdkkt.services.ivschat

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration

@Generated
public
    fun cloudWatchLogsDestinationConfigurationProperty(initializer: CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty.Builder.() -> Unit
    = {}): CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty =
    CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty.builder().apply(initializer).build()
