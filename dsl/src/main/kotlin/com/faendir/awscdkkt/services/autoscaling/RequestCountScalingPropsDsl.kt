package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.RequestCountScalingProps

@Generated
public fun requestCountScalingProps(initializer: RequestCountScalingProps.Builder.() -> Unit = {}):
    RequestCountScalingProps = RequestCountScalingProps.builder().apply(initializer).build()
