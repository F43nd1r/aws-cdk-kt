@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.EventBusPolicy
import software.amazon.awscdk.services.events.EventBusPolicyProps
import software.constructs.Construct

public fun Construct.eventBusPolicy(
  id: String,
  props: EventBusPolicyProps,
  initializer: EventBusPolicy.() -> Unit = {},
): EventBusPolicy = EventBusPolicy(this, id, props).apply(initializer)
