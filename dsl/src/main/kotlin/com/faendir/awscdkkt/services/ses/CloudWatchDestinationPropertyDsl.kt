@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination

public
    fun cloudWatchDestinationProperty(initializer: CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.Builder.() -> Unit):
    CfnConfigurationSetEventDestination.CloudWatchDestinationProperty =
    CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.builder().apply(initializer).build()
