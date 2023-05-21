package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination

@Generated
public
    fun eventDestinationProperty(initializer: CfnConfigurationSetEventDestination.EventDestinationProperty.Builder.() -> Unit
    = {}): CfnConfigurationSetEventDestination.EventDestinationProperty =
    CfnConfigurationSetEventDestination.EventDestinationProperty.builder().apply(initializer).build()
