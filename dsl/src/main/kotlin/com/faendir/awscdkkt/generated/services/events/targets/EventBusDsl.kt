package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.events.targets.EventBus

@Generated
public fun buildEventBus(eventBus: IEventBus, initializer: @AwsCdkDsl EventBus.Builder.() -> Unit =
    {}): EventBus = EventBus.Builder.create(eventBus).apply(initializer).build()
