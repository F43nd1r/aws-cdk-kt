package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnApiDestination
import software.amazon.awscdk.services.events.CfnApiDestinationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApiDestination(
  id: String,
  props: CfnApiDestinationProps,
  initializer: CfnApiDestination.() -> Unit = {},
): CfnApiDestination = CfnApiDestination(this, id, props).apply(initializer)
