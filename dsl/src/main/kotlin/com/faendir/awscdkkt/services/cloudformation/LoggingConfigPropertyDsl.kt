package com.faendir.awscdkkt.services.cloudformation

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnTypeActivation

@Generated
public
    fun loggingConfigProperty(initializer: CfnTypeActivation.LoggingConfigProperty.Builder.() -> Unit
    = {}): CfnTypeActivation.LoggingConfigProperty =
    CfnTypeActivation.LoggingConfigProperty.builder().apply(initializer).build()
