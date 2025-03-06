package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.Ec2HealthChecksOptions

@Generated
public fun buildEc2HealthChecksOptions(initializer: @AwsCdkDsl
    Ec2HealthChecksOptions.Builder.() -> Unit = {}): Ec2HealthChecksOptions =
    Ec2HealthChecksOptions.Builder().apply(initializer).build()
