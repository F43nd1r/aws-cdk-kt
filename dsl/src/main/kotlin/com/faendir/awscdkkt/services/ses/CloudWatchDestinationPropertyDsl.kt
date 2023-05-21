package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination

@Generated
public
    fun cloudWatchDestinationProperty(initializer: CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.Builder.() -> Unit
    = {}): CfnConfigurationSetEventDestination.CloudWatchDestinationProperty =
    CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.builder().apply(initializer).build()
