package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRouting
import software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRoutingProps

@Generated
public fun timeBasedCanaryTrafficRouting(props: TimeBasedCanaryTrafficRoutingProps):
    TimeBasedCanaryTrafficRouting = TimeBasedCanaryTrafficRouting(props)

@Generated
public fun buildTimeBasedCanaryTrafficRouting(initializer: @AwsCdkDsl
    TimeBasedCanaryTrafficRouting.Builder.() -> Unit): TimeBasedCanaryTrafficRouting =
    TimeBasedCanaryTrafficRouting.Builder.create().apply(initializer).build()
