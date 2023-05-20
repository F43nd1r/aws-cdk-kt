@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

public
    fun priorityConfigurationProperty(initializer: CfnGameSessionQueue.PriorityConfigurationProperty.Builder.() -> Unit):
    CfnGameSessionQueue.PriorityConfigurationProperty =
    CfnGameSessionQueue.PriorityConfigurationProperty.builder().apply(initializer).build()
