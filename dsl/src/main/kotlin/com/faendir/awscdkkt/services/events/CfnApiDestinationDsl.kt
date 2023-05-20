@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnApiDestination
import software.amazon.awscdk.services.events.CfnApiDestinationProps
import software.constructs.Construct

public fun Construct.cfnApiDestination(
  id: String,
  props: CfnApiDestinationProps,
  initializer: CfnApiDestination.() -> Unit = {},
): CfnApiDestination = CfnApiDestination(this, id, props).apply(initializer)
