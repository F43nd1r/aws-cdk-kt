package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

@Generated
public
    fun loggingFilterProperty(initializer: CfnLoggingConfiguration.LoggingFilterProperty.Builder.() -> Unit
    = {}): CfnLoggingConfiguration.LoggingFilterProperty =
    CfnLoggingConfiguration.LoggingFilterProperty.builder().apply(initializer).build()
