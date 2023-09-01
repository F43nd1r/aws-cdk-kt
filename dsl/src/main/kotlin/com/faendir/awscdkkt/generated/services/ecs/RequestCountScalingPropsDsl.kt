package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.RequestCountScalingProps

@Generated
public fun buildRequestCountScalingProps(initializer: @AwsCdkDsl
    RequestCountScalingProps.Builder.() -> Unit = {}): RequestCountScalingProps =
    RequestCountScalingProps.Builder().apply(initializer).build()
