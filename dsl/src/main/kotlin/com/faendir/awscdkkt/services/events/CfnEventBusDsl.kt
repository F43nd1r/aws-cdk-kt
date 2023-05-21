package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEventBus
import software.amazon.awscdk.services.events.CfnEventBusProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventBus(
  id: String,
  props: CfnEventBusProps,
  initializer: CfnEventBus.() -> Unit = {},
): CfnEventBus = CfnEventBus(this, id, props).apply(initializer)
