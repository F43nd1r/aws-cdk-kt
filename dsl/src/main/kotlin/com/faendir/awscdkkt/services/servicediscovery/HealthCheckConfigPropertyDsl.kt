@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnService

public
    fun healthCheckConfigProperty(initializer: CfnService.HealthCheckConfigProperty.Builder.() -> Unit):
    CfnService.HealthCheckConfigProperty =
    CfnService.HealthCheckConfigProperty.builder().apply(initializer).build()
