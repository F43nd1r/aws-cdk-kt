package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.EventBusPolicy
import software.amazon.awscdk.services.events.EventBusPolicyProps
import software.constructs.Construct

@Generated
public fun Construct.eventBusPolicy(
  id: String,
  props: EventBusPolicyProps,
  initializer: @AwsCdkDsl EventBusPolicy.() -> Unit = {},
): EventBusPolicy = EventBusPolicy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEventBusPolicy(id: String, initializer: @AwsCdkDsl EventBusPolicy.Builder.() -> Unit = {}): EventBusPolicy = EventBusPolicy.Builder.create(this, id).apply(initializer).build()
