package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

@Generated
public
    fun healthCheckConfigProperty(initializer: CfnTargetGroup.HealthCheckConfigProperty.Builder.() -> Unit
    = {}): CfnTargetGroup.HealthCheckConfigProperty =
    CfnTargetGroup.HealthCheckConfigProperty.builder().apply(initializer).build()
