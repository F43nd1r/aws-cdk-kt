package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnContainer

@Generated
public
    fun healthCheckConfigProperty(initializer: CfnContainer.HealthCheckConfigProperty.Builder.() -> Unit
    = {}): CfnContainer.HealthCheckConfigProperty =
    CfnContainer.HealthCheckConfigProperty.builder().apply(initializer).build()
