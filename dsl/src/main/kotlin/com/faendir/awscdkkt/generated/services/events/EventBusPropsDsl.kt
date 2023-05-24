package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.EventBusProps

@Generated
public fun buildEventBusProps(initializer: @AwsCdkDsl EventBusProps.Builder.() -> Unit):
    EventBusProps = EventBusProps.Builder().apply(initializer).build()
