package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.ScalingInterval

@Generated
public fun buildScalingInterval(initializer: @AwsCdkDsl ScalingInterval.Builder.() -> Unit):
    ScalingInterval = ScalingInterval.Builder().apply(initializer).build()
