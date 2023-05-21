package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnService

@Generated
public
    fun healthCheckCustomConfigProperty(initializer: CfnService.HealthCheckCustomConfigProperty.Builder.() -> Unit
    = {}): CfnService.HealthCheckCustomConfigProperty =
    CfnService.HealthCheckCustomConfigProperty.builder().apply(initializer).build()
