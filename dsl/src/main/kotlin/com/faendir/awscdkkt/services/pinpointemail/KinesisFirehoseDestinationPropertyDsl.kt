package com.faendir.awscdkkt.services.pinpointemail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination

@Generated
public
    fun kinesisFirehoseDestinationProperty(initializer: CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.Builder.() -> Unit
    = {}): CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty =
    CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.builder().apply(initializer).build()
