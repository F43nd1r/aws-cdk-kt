package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnService

@Generated
public
    fun healthCheckConfigurationProperty(initializer: CfnService.HealthCheckConfigurationProperty.Builder.() -> Unit
    = {}): CfnService.HealthCheckConfigurationProperty =
    CfnService.HealthCheckConfigurationProperty.builder().apply(initializer).build()
