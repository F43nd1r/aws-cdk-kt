@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.pinpointemail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination

public
    fun kinesisFirehoseDestinationProperty(initializer: CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.Builder.() -> Unit):
    CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty =
    CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.builder().apply(initializer).build()
