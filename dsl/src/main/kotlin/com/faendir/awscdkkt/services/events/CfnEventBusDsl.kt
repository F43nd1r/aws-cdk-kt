@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEventBus
import software.amazon.awscdk.services.events.CfnEventBusProps
import software.constructs.Construct

public fun Construct.cfnEventBus(
  id: String,
  props: CfnEventBusProps,
  initializer: CfnEventBus.() -> Unit = {},
): CfnEventBus = CfnEventBus(this, id, props).apply(initializer)
