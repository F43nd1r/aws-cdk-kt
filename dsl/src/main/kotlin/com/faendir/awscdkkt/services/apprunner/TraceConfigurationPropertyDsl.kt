package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration

@Generated
public
    fun traceConfigurationProperty(initializer: CfnObservabilityConfiguration.TraceConfigurationProperty.Builder.() -> Unit
    = {}): CfnObservabilityConfiguration.TraceConfigurationProperty =
    CfnObservabilityConfiguration.TraceConfigurationProperty.builder().apply(initializer).build()
