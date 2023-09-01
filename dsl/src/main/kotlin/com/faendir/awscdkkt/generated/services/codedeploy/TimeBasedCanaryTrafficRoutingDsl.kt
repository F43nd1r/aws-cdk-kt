package com.faendir.awscdkkt.generated.services.codedeploy

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRouting

@Generated
public fun buildTimeBasedCanaryTrafficRouting(initializer: @AwsCdkDsl
    TimeBasedCanaryTrafficRouting.Builder.() -> Unit = {}): TimeBasedCanaryTrafficRouting =
    TimeBasedCanaryTrafficRouting.Builder.create().apply(initializer).build()
