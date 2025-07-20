package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.targets.EventBridgePutEvents
import software.amazon.awscdk.services.scheduler.targets.ScheduleTargetBaseProps

@Generated
public fun buildEventBridgePutEvents(initializer: @AwsCdkDsl EventBridgePutEvents.Builder.() -> Unit = {}): EventBridgePutEvents = EventBridgePutEvents.Builder.create().apply(initializer).build()

@Generated
public fun buildEventBridgePutEvents(props: ScheduleTargetBaseProps, initializer: @AwsCdkDsl EventBridgePutEvents.Builder.() -> Unit = {}): EventBridgePutEvents = EventBridgePutEvents.Builder.create(props).apply(initializer).build()
