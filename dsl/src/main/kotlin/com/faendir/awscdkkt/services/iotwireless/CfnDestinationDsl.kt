@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iotwireless

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnDestination
import software.amazon.awscdk.services.iotwireless.CfnDestinationProps
import software.constructs.Construct

public fun Construct.cfnDestination(
  id: String,
  props: CfnDestinationProps,
  initializer: CfnDestination.() -> Unit = {},
): CfnDestination = CfnDestination(this, id, props).apply(initializer)
