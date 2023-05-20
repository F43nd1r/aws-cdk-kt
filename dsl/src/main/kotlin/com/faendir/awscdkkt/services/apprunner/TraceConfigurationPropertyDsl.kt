@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnObservabilityConfiguration

public
    fun traceConfigurationProperty(initializer: CfnObservabilityConfiguration.TraceConfigurationProperty.Builder.() -> Unit):
    CfnObservabilityConfiguration.TraceConfigurationProperty =
    CfnObservabilityConfiguration.TraceConfigurationProperty.builder().apply(initializer).build()
