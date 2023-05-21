package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnService

@Generated
public
    fun healthCheckConfigProperty(initializer: CfnService.HealthCheckConfigProperty.Builder.() -> Unit
    = {}): CfnService.HealthCheckConfigProperty =
    CfnService.HealthCheckConfigProperty.builder().apply(initializer).build()
