@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHealthCheck

public
    fun healthCheckTagProperty(initializer: CfnHealthCheck.HealthCheckTagProperty.Builder.() -> Unit):
    CfnHealthCheck.HealthCheckTagProperty =
    CfnHealthCheck.HealthCheckTagProperty.builder().apply(initializer).build()
