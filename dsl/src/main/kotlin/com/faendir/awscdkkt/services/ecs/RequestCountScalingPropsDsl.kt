package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.RequestCountScalingProps

@Generated
public fun requestCountScalingProps(initializer: RequestCountScalingProps.Builder.() -> Unit = {}):
    RequestCountScalingProps = RequestCountScalingProps.builder().apply(initializer).build()
