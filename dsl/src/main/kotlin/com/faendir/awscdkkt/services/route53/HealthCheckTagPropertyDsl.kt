@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHealthCheck

public
    fun healthCheckTagProperty(initializer: CfnHealthCheck.HealthCheckTagProperty.Builder.() -> Unit):
    CfnHealthCheck.HealthCheckTagProperty =
    CfnHealthCheck.HealthCheckTagProperty.builder().apply(initializer).build()
