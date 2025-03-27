package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.targets.EventBridgePutEventsEntry

@Generated
public fun buildEventBridgePutEventsEntry(initializer: @AwsCdkDsl
    EventBridgePutEventsEntry.Builder.() -> Unit = {}): EventBridgePutEventsEntry =
    EventBridgePutEventsEntry.Builder().apply(initializer).build()
