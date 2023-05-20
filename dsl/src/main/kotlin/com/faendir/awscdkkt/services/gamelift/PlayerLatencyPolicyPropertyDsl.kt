@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

public
    fun playerLatencyPolicyProperty(initializer: CfnGameSessionQueue.PlayerLatencyPolicyProperty.Builder.() -> Unit):
    CfnGameSessionQueue.PlayerLatencyPolicyProperty =
    CfnGameSessionQueue.PlayerLatencyPolicyProperty.builder().apply(initializer).build()
