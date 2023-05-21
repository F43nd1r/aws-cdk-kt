package com.faendir.awscdkkt.services.pinpointemail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination

@Generated
public
    fun pinpointDestinationProperty(initializer: CfnConfigurationSetEventDestination.PinpointDestinationProperty.Builder.() -> Unit
    = {}): CfnConfigurationSetEventDestination.PinpointDestinationProperty =
    CfnConfigurationSetEventDestination.PinpointDestinationProperty.builder().apply(initializer).build()
