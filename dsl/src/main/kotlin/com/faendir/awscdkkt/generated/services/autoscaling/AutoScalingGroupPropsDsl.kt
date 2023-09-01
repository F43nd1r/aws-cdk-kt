package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.AutoScalingGroupProps

@Generated
public fun buildAutoScalingGroupProps(initializer: @AwsCdkDsl
    AutoScalingGroupProps.Builder.() -> Unit = {}): AutoScalingGroupProps =
    AutoScalingGroupProps.Builder().apply(initializer).build()
