package com.faendir.awscdkkt.services.pinpointemail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination

@Generated
public
    fun eventDestinationProperty(initializer: CfnConfigurationSetEventDestination.EventDestinationProperty.Builder.() -> Unit
    = {}): CfnConfigurationSetEventDestination.EventDestinationProperty =
    CfnConfigurationSetEventDestination.EventDestinationProperty.builder().apply(initializer).build()
