package com.faendir.awscdkkt.services.pinpointemail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination

@Generated
public
    fun snsDestinationProperty(initializer: CfnConfigurationSetEventDestination.SnsDestinationProperty.Builder.() -> Unit
    = {}): CfnConfigurationSetEventDestination.SnsDestinationProperty =
    CfnConfigurationSetEventDestination.SnsDestinationProperty.builder().apply(initializer).build()
