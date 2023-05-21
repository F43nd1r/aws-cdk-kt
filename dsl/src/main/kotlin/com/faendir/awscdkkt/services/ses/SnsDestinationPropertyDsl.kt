package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination

@Generated
public
    fun snsDestinationProperty(initializer: CfnConfigurationSetEventDestination.SnsDestinationProperty.Builder.() -> Unit
    = {}): CfnConfigurationSetEventDestination.SnsDestinationProperty =
    CfnConfigurationSetEventDestination.SnsDestinationProperty.builder().apply(initializer).build()
