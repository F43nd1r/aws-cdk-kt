@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

public
    fun healthCheckConfigProperty(initializer: CfnTargetGroup.HealthCheckConfigProperty.Builder.() -> Unit):
    CfnTargetGroup.HealthCheckConfigProperty =
    CfnTargetGroup.HealthCheckConfigProperty.builder().apply(initializer).build()
