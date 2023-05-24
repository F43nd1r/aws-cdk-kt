package com.faendir.awscdkkt.generated.services.lambda.destinations

import javax.`annotation`.Generated
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.lambda.destinations.EventBridgeDestination

@Generated
public fun eventBridgeDestination(): EventBridgeDestination = EventBridgeDestination()

@Generated
public fun eventBridgeDestination(eventBus: IEventBus): EventBridgeDestination =
    EventBridgeDestination(eventBus)
