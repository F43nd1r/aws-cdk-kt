package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationOptions

@Generated
public
    fun configurationSetEventDestinationOptions(initializer: ConfigurationSetEventDestinationOptions.Builder.() -> Unit
    = {}): ConfigurationSetEventDestinationOptions =
    ConfigurationSetEventDestinationOptions.builder().apply(initializer).build()
