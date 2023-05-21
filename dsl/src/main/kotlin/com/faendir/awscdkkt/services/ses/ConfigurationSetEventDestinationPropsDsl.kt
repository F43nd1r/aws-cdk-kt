package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps

@Generated
public
    fun configurationSetEventDestinationProps(initializer: ConfigurationSetEventDestinationProps.Builder.() -> Unit
    = {}): ConfigurationSetEventDestinationProps =
    ConfigurationSetEventDestinationProps.builder().apply(initializer).build()
