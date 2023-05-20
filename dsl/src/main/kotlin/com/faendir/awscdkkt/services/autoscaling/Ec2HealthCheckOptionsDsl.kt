@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions

public fun ec2HealthCheckOptions(initializer: Ec2HealthCheckOptions.Builder.() -> Unit):
    Ec2HealthCheckOptions = Ec2HealthCheckOptions.builder().apply(initializer).build()
