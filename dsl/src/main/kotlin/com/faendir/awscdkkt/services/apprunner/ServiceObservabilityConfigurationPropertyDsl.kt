package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnService

@Generated
public
    fun serviceObservabilityConfigurationProperty(initializer: CfnService.ServiceObservabilityConfigurationProperty.Builder.() -> Unit
    = {}): CfnService.ServiceObservabilityConfigurationProperty =
    CfnService.ServiceObservabilityConfigurationProperty.builder().apply(initializer).build()
