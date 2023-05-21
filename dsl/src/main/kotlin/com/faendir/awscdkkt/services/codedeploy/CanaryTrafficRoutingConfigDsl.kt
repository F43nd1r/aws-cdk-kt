package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.CanaryTrafficRoutingConfig

@Generated
public fun canaryTrafficRoutingConfig(initializer: CanaryTrafficRoutingConfig.Builder.() -> Unit =
    {}): CanaryTrafficRoutingConfig =
    CanaryTrafficRoutingConfig.builder().apply(initializer).build()
