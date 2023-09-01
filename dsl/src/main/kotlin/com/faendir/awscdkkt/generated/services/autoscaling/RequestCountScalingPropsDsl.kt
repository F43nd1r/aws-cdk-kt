package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.RequestCountScalingProps

@Generated
public fun buildRequestCountScalingProps(initializer: @AwsCdkDsl
    RequestCountScalingProps.Builder.() -> Unit = {}): RequestCountScalingProps =
    RequestCountScalingProps.Builder().apply(initializer).build()
