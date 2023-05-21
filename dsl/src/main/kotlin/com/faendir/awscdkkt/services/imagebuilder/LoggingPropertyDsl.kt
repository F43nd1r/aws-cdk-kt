package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration

@Generated
public
    fun loggingProperty(initializer: CfnInfrastructureConfiguration.LoggingProperty.Builder.() -> Unit
    = {}): CfnInfrastructureConfiguration.LoggingProperty =
    CfnInfrastructureConfiguration.LoggingProperty.builder().apply(initializer).build()
