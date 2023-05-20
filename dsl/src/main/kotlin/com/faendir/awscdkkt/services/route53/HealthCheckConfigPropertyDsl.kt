@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHealthCheck

public
    fun healthCheckConfigProperty(initializer: CfnHealthCheck.HealthCheckConfigProperty.Builder.() -> Unit):
    CfnHealthCheck.HealthCheckConfigProperty =
    CfnHealthCheck.HealthCheckConfigProperty.builder().apply(initializer).build()
