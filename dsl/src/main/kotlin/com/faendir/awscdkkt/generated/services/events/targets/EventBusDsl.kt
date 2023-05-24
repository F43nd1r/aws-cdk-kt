package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.events.targets.EventBus
import software.amazon.awscdk.services.events.targets.EventBusProps

@Generated
public fun eventBus(eventBus: IEventBus): EventBus = EventBus(eventBus)

@Generated
public fun eventBus(eventBus: IEventBus, props: EventBusProps): EventBus = EventBus(eventBus, props)

@Generated
public fun buildEventBus(eventBus: IEventBus, initializer: @AwsCdkDsl EventBus.Builder.() -> Unit):
    EventBus = EventBus.Builder.create(eventBus).apply(initializer).build()
