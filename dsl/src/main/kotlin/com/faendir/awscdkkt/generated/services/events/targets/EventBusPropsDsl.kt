package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.EventBusProps

@Generated
public fun buildEventBusProps(initializer: @AwsCdkDsl EventBusProps.Builder.() -> Unit = {}):
    EventBusProps = EventBusProps.Builder().apply(initializer).build()
