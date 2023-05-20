@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions

public
    fun configurationSetEventDestinationOptions(initializer: ConfigurationSetEventDestinationOptions.Builder.() -> Unit):
    ConfigurationSetEventDestinationOptions =
    ConfigurationSetEventDestinationOptions.builder().apply(initializer).build()
