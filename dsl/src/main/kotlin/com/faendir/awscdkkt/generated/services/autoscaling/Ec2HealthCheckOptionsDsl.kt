@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions

@Deprecated(message =
    "software.amazon.awscdk.services.autoscaling.Ec2HealthCheckOptions is deprecated in CDK.")
@Generated
public fun buildEc2HealthCheckOptions(initializer: @AwsCdkDsl
    Ec2HealthCheckOptions.Builder.() -> Unit = {}): Ec2HealthCheckOptions =
    Ec2HealthCheckOptions.Builder().apply(initializer).build()
