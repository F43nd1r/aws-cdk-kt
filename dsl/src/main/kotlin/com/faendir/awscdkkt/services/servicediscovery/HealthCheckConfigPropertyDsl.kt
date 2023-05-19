@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicediscovery

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicediscovery.CfnService

public
    fun healthCheckConfigProperty(initializer: CfnService.HealthCheckConfigProperty.Builder.() -> Unit):
    CfnService.HealthCheckConfigProperty =
    CfnService.HealthCheckConfigProperty.builder().apply(initializer).build()
