package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

@Generated
public
    fun playerLatencyPolicyProperty(initializer: CfnGameSessionQueue.PlayerLatencyPolicyProperty.Builder.() -> Unit
    = {}): CfnGameSessionQueue.PlayerLatencyPolicyProperty =
    CfnGameSessionQueue.PlayerLatencyPolicyProperty.builder().apply(initializer).build()
