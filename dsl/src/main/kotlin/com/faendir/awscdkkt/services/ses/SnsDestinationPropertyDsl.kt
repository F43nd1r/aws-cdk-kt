@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination

public
    fun snsDestinationProperty(initializer: CfnConfigurationSetEventDestination.SnsDestinationProperty.Builder.() -> Unit):
    CfnConfigurationSetEventDestination.SnsDestinationProperty =
    CfnConfigurationSetEventDestination.SnsDestinationProperty.builder().apply(initializer).build()
