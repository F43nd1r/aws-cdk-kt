package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRouting
import software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps

@Generated
public fun timeBasedLinearTrafficRouting(props: TimeBasedLinearTrafficRoutingProps):
    TimeBasedLinearTrafficRouting = TimeBasedLinearTrafficRouting(props)

@Generated
public fun buildTimeBasedLinearTrafficRouting(initializer: @AwsCdkDsl
    TimeBasedLinearTrafficRouting.Builder.() -> Unit): TimeBasedLinearTrafficRouting =
    TimeBasedLinearTrafficRouting.Builder.create().apply(initializer).build()
