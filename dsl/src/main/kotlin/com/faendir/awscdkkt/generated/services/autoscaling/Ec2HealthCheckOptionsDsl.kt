package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions

@Generated
public fun buildEc2HealthCheckOptions(initializer: @AwsCdkDsl
    Ec2HealthCheckOptions.Builder.() -> Unit): Ec2HealthCheckOptions =
    Ec2HealthCheckOptions.Builder().apply(initializer).build()
