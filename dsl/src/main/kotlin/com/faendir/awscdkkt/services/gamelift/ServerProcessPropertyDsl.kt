package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnFleet

@Generated
public fun serverProcessProperty(initializer: CfnFleet.ServerProcessProperty.Builder.() -> Unit =
    {}): CfnFleet.ServerProcessProperty =
    CfnFleet.ServerProcessProperty.builder().apply(initializer).build()
