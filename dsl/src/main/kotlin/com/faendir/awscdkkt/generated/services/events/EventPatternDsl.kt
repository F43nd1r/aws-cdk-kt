package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.EventPattern

@Generated
public fun buildEventPattern(initializer: @AwsCdkDsl EventPattern.Builder.() -> Unit = {}): EventPattern = EventPattern.Builder().apply(initializer).build()
