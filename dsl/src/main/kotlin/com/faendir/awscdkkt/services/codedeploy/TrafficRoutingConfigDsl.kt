package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig

@Generated
public fun trafficRoutingConfig(initializer: TrafficRoutingConfig.Builder.() -> Unit = {}):
    TrafficRoutingConfig = TrafficRoutingConfig.builder().apply(initializer).build()
