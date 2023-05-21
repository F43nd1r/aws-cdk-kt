package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig

@Generated
public fun linearTrafficRoutingConfig(initializer: LinearTrafficRoutingConfig.Builder.() -> Unit =
    {}): LinearTrafficRoutingConfig =
    LinearTrafficRoutingConfig.builder().apply(initializer).build()
