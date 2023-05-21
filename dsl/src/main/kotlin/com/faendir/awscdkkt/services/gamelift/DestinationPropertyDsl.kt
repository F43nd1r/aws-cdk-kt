package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

@Generated
public
    fun destinationProperty(initializer: CfnGameSessionQueue.DestinationProperty.Builder.() -> Unit
    = {}): CfnGameSessionQueue.DestinationProperty =
    CfnGameSessionQueue.DestinationProperty.builder().apply(initializer).build()
