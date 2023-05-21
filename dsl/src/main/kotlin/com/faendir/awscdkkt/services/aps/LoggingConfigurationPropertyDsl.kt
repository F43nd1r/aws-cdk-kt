package com.faendir.awscdkkt.services.aps

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.aps.CfnWorkspace

@Generated
public
    fun loggingConfigurationProperty(initializer: CfnWorkspace.LoggingConfigurationProperty.Builder.() -> Unit
    = {}): CfnWorkspace.LoggingConfigurationProperty =
    CfnWorkspace.LoggingConfigurationProperty.builder().apply(initializer).build()
