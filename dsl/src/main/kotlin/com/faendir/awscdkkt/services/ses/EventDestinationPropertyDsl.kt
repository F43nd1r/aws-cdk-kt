@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination

public
    fun eventDestinationProperty(initializer: CfnConfigurationSetEventDestination.EventDestinationProperty.Builder.() -> Unit):
    CfnConfigurationSetEventDestination.EventDestinationProperty =
    CfnConfigurationSetEventDestination.EventDestinationProperty.builder().apply(initializer).build()
