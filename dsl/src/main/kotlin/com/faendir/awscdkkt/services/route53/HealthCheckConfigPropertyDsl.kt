package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHealthCheck

@Generated
public
    fun healthCheckConfigProperty(initializer: CfnHealthCheck.HealthCheckConfigProperty.Builder.() -> Unit
    = {}): CfnHealthCheck.HealthCheckConfigProperty =
    CfnHealthCheck.HealthCheckConfigProperty.builder().apply(initializer).build()
