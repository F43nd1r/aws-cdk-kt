@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

public
    fun healthCheckConfigProperty(initializer: CfnTargetGroup.HealthCheckConfigProperty.Builder.() -> Unit):
    CfnTargetGroup.HealthCheckConfigProperty =
    CfnTargetGroup.HealthCheckConfigProperty.builder().apply(initializer).build()
