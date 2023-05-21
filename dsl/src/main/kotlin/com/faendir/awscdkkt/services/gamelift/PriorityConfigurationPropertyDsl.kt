package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

@Generated
public
    fun priorityConfigurationProperty(initializer: CfnGameSessionQueue.PriorityConfigurationProperty.Builder.() -> Unit
    = {}): CfnGameSessionQueue.PriorityConfigurationProperty =
    CfnGameSessionQueue.PriorityConfigurationProperty.builder().apply(initializer).build()
