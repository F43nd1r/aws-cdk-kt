@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

public
    fun playerLatencyPolicyProperty(initializer: CfnGameSessionQueue.PlayerLatencyPolicyProperty.Builder.() -> Unit):
    CfnGameSessionQueue.PlayerLatencyPolicyProperty =
    CfnGameSessionQueue.PlayerLatencyPolicyProperty.builder().apply(initializer).build()
